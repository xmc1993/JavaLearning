package com.xmc.jianzhiOffer;

/**
 * 三个或者更多个呢
 * Created by xmc1993 on 2017/7/3.
 */
public class Q40 {

    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 4, 1, 2, 4};
//        System.o
// ut.println(oneDiff(test1));
        int[] test2 = {1, 2, 3, 4, 5, 1, 2, 3};
        twoDiff(test2);
    }

    public static int oneDiff(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = result ^ arr[i];
        }
        return result;
    }

    public static int twoDiff(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = result ^ arr[i];
        }

        int count = 0;
        while (result != 0) {
            result >>= 1;
            count ++;
        }
        count--;
        int res1 = 0;
        int res2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (isBit1(arr[i], count)) {
                res1 ^= arr[i];
            }else {
                res2 ^= arr[i];
            }
        }
        System.out.println(res1);
        System.out.println(res2);
        return 0;
    }

    public static boolean isBit1(int num, int offset){
        num >>= offset;
        return (num & 1) == 1;
    }
}
