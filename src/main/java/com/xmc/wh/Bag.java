package com.xmc.wh;

import java.util.Scanner;

/**
 *
 * 背包\动态规划问题
 * Created by xmc1993 on 2017/7/10.
 */
public class Bag {
    private final static int MAX_N = 50005;
    private static int coinCount;//硬币的种类
    private static int[] w = new int[MAX_N];//硬币重量数组
    private static int[] v = new int[MAX_N];//硬币价值数组
    private static int coinWeight;//硬币的重量
    private static int[] dp = new int[MAX_N];//硬币的重量

    public static void main(String[] args) {
        process();
    }

    public static void process(){
        Scanner scanner = new Scanner(System.in);
        int caseCount = scanner.nextInt();
        for (int i = 0; i < caseCount; i++) {
            init();
            //获得硬币的重量
            int baseWeight = scanner.nextInt();
            int totalWeight = scanner.nextInt();
            coinWeight = totalWeight - baseWeight;
            //获得硬币的种类信息
            coinCount = scanner.nextInt();
            w = new int[caseCount];
            v = new int[caseCount];
            //装入每一种硬币的信息
            for (int j = 0; j < coinCount; j++) {
                v[j] = scanner.nextInt();
                w[j] = scanner.nextInt();
            }
            //处理当前Case
            processSingleCase();
        }
    }

    private static void init() {
        for (int i = 0; i < MAX_N; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
    }

    /**
     * 处理单个Case
     */
    public static void processSingleCase(){
        //TODO step1: 预处理 not important
        //dp
        for (int i = 0; i < coinCount; i++) {
            for (int j = w[i]; j <= coinWeight; j++) {
                dp[j] = Math.min(dp[j], dp[j - w[i]] + v[i]);
            }
        }

        if (dp[coinWeight] != Integer.MAX_VALUE)
        {
            System.out.println("The minimum amount of money in the piggy-bank is" + dp[coinWeight] +".\n");
        }
        else
        {
            System.out.println("This is impossible.\n");
        }
    }
}
