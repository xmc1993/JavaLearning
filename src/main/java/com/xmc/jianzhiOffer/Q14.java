package com.xmc.jianzhiOffer;

/**
 * 调整数组的偶数在奇数前面
 * 快排的思想
 * Created by xmc1993 on 2017/7/4.
 */
public class Q14 {

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 7, 8, 3, 4, 5, 1, 5, 8, 10};
        parse(arr);
        for (int i : arr) {
            System.out.print(i + "-");
        }
        System.out.println("");
    }

    public static void parse(int[] arr) {
        int lPtr = 0;
        int rPtr = arr.length - 1;
        while (lPtr < rPtr) {
            while (arr[lPtr] % 2 == 0 && lPtr < (arr.length - 1)) {
                lPtr++;
            }
            while (arr[rPtr] % 2 == 1 && rPtr > 0) {
                rPtr--;
            }
            if (lPtr < rPtr) {
                int tmp = arr[lPtr];
                arr[lPtr] = arr[rPtr];
                arr[rPtr] = tmp;
            }
        }
    }
}
