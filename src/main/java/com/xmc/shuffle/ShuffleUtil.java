package com.xmc.shuffle;

import java.util.Random;

/**
 * Created by xmc1993 on 2017/4/27.
 */
public class ShuffleUtil {

    private static Random random;
    private static long seed;

    static {
        seed = System.currentTimeMillis();
        random = new Random(seed);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        shuffleBase(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "-");
        }
    }

    /**
     * 最基础的洗牌算法：每次从剩下的元素中随机选一个排到新的队列中 但是这种方法是 n^2 的复杂度
     *
     * @param array
     */
    public static void shuffleBase(int[] array) {
        int len = array.length;
        int[] aux = new int[len];
        for (int i = len; i > 0; i--) {
            int j = random.nextInt(i);
            aux[len - i] = array[j];
            //需要位移将剩下的元素整合一下
            for (int m = j; m < len - 1; m++) {
                array[m] = array[m+1];
            }
        }
        for (int i = 0; i < len; i++) {
            array[i] = aux[i];
        }
    }

    /**
     * 打乱数组排序的方法 改进的方法就是不采用辅助数组 而是和数组本身的元素交换 这样算法复杂度降到了 O(n)
     * 每次把筛选过的和没有筛选过的元素筛选一下 这样一边就是筛选过的元素一边是没有筛选过的元素
     *
     * @param array
     */
    public static void shuffle(int[] array) {
        if (null == array) return;
        int len = array.length;
        for (int i = 0; i < len; i++) {
            int r = i + random.nextInt(len - i);
            int temp = array[i];
            array[i] = array[r];
            array[r] = temp;
        }

    }
}
