package com.xmc.algorithm;

import java.util.Stack;

/**
 * Created by xmc1993 on 2017/3/19.
 */
public class MNMatrix {

    static int[][] aux = new int[9][2];
    static int index = 9;

    public static void main(String[] args) {
        int[][] ptr = {
                {1, 2, 3, 4, 5, 6},
                {6, 5, 4, 3, 2, 1},
                {1, 2, 3, 4, 5, 6},
                {6, 5, 4, 3, 2, 1}
        };

        System.out.println(dfs(ptr, 4, 6));
        System.out.println("");
    }


    public static int dfs(int[][] ptr, int m, int n) {

        if (m < 1 || n < 1) {//如果是路径
            return 0;
        }

        int option1 = dfs(ptr, m - 1, n);
        int option2 = dfs(ptr, m, n - 1);
//        index++;
        if (option1 > option2) {
            aux[m+n-2][0] = m-1;
            aux[m+n-2][1] = n;
            return option1 + ptr[m-1][n-1];
        } else {
            aux[m+n-2][0] = m;
            aux[m+n-2][1] = n-1;
            return option2 + ptr[m-1][n-1];
        }


    }
}
