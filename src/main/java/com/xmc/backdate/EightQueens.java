package com.xmc.backdate;

/**
 * Created by xmc1993 on 17/2/17.
 * 八皇后问题
 * 不需要设计新的数据结构 实际上只需要记录Y坐标 因为X坐标是确定的
 */
public class EightQueens {

    public static int N;
    public static int count = 0;
    public static int aux[];


    public static void main(String[] args) {
        process(8);
        System.out.println(count);
        System.out.println(++count);
        System.out.println(count++);
    }

    public static void process(int N) {
        EightQueens.N = N;
        aux = new int[N];
        search(0);
    }

    public static void search(int T) {
        if (T == N) {
            count++;
            System.out.println("Get a result !");
            return;
        }

        for (int i = 0; i < N; i++) {
            aux[T] = i;
            boolean ok = checkValid(T, i);
            if (ok) search( T + 1);
        }
    }

    public static boolean checkValid(int T, int Y) {
        for (int i = 0; i < T; i++) {
            if (aux[i] == Y || Math.abs(aux[i] - Y) == Math.abs(i - T)) return false;
        }
        return true;
    }





}
