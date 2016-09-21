package com.xmc.executor;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by xmc1993 on 16/9/21.
 */
public class ExecutorCase {
    //据说是最佳实践
    private static final int THREADS_COUNT = Runtime.getRuntime().availableProcessors() * 2;//getRuntime是Runtime类的工厂方法、availableProcessors方法是Runtime对象得到当前虚拟机中可以使用的线程数量

    private static final Executor executor = Executors.newFixedThreadPool(THREADS_COUNT);
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            final int var = i;
            executor.execute(new Runnable() {
                public void run() {
                    System.out.println(var);
                }
            });
        }
    }
}
