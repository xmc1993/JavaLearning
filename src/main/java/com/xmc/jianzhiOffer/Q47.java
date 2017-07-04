package com.xmc.jianzhiOffer;

/**
 *
 * 不用加减乘除法做加法
 *
 * 负数的时候？
 * java没有无符号整数？
 * java整数32位，上下限是多少？
 *
 * Created by xmc1993 on 2017/7/3.
 */
public class Q47 {


    public static void main(String[] args) {
        System.out.println(add(-15, 3));
    }

    public static int add(int a, int b){
        int ans = a ^ b;
        int carry = a & b ;
        int temp;
        while (carry != 0) {
            temp = ans;
            carry <<= 1;
            ans = ans ^ carry;
            carry = temp & carry;
        }
        return ans;
    }

}
