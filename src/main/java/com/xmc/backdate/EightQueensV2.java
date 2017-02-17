package com.xmc.backdate;

/**
 * Created by xmc1993 on 17/2/17.
 * 总体来说回溯方法需要一个推动力也就是 For循环
 * 回溯问题一般是每一步都有多个选择
 * 于是把选择做成for循环
 * 一步一步向下的步骤做成递归 (递归的要点是每一次递归时参数的地位是一致的 需要设置一个终止点)
 */
public class EightQueensV2 {
    private static int[] arr;
    private static int count = 0;
    private static int N;


    public static void main(String[] args) {
        process(8);
        System.out.println(count);
    }

    public static void process(int n) {
        N = n;
        arr = new int[n];
        search(0);
    }

    public static void search(int X) {
        if (X == N) {
            count++;
            return;
        }
        for (int y = 0; y < N; y++) {
            arr[X] = y;
            boolean tag = true;
            for (int x = 0; x < X; x++) {
                if (y == arr[x] || (x - X) == (arr[x] - y) || (x - X) == (y - arr[x])) {
                    tag = false;
                    break;
                }
            }
            if (tag) search(X + 1);
        }
    }
}
