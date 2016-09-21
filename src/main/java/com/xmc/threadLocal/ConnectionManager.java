package com.xmc.threadLocal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by xmc1993 on 16/9/21.
 * 因为JDBC的connection对象并不是线程安全的 所以需要使用ThreadLocal
 * 其他的问题:那么不同的connection同时访问数据库的时候数据库该怎么处理?? 总会有先后顺序么??
 */
public class ConnectionManager {
    private static ThreadLocal<Connection> connectionHolder = new ThreadLocal<Connection>(){
        @Override
        protected Connection initialValue() {  //需要给定对象的初始化方式 当ThreadLocal对象check到当前thread对应的对象并不存在时 则调用initialValue方法进行初始化
            Connection conn = null;
            try {

                Class.forName("com.mysql.fabric.jdbc.FabricMySQLDriver");
                conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/test", "root", "xmc117014");
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            return conn;
        }
    };

    public static Connection getConnection() {
        return connectionHolder.get();
    }

    public static void setConnection(Connection conn) {
        connectionHolder.set(conn);
    }
}


/**
 * protected T initialValue() {
 *  return null;
 * }
 * ThreadLocal默认的initialValue方法直接是return null
 * 需要通过override initialValue方法 或者 调用set方法来进行当前线程的对应值的初始化
 *
 *
 * 其他:因为ThreadLocal最终实现的ThreadLocalMap的对象实际上是属于Thread的属性 如果使用线程池  还需要考虑每次使用完线程将相应的变量移除???
 *
 */