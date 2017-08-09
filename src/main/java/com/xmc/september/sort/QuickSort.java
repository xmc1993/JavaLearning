package com.xmc.september.sort;

/**
 * 快速排序练习
 * Created by xmc1993 on 2017/7/19.
 */
public class QuickSort extends Sort{

    public static void main(String[] args) {
        int[] arr = {1, 199, 12, 67, 23, 34, 31, 22, 11, 22, 655};

        quickSort(arr);

        for (int i : arr) {
            System.out.print(i + "-");
        }
    }


    static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    static void quickSort(int[] arr, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int pivot = partition(arr, lo, hi);
        quickSort(arr, lo, pivot - 1);
        quickSort(arr, pivot + 1, hi);
    }

    static int partition(int[] arr, int lo, int hi) {
        int lp = lo;
        int rp = hi + 1;
        int key = arr[lo];

        //一个大while循环 大while循环中断的条件就是两个指针相交了
        //两个小while循环 判断的边界条件是不要越过lo和hi
        while (true) {
            //TODO 注意边界判断是lo和hi 而不是 lp==rp 那样就越界了。
            while (arr[++lp] < key) {
                if (lp == hi) break;
            }
            while (arr[--rp] > key) {
                if (rp == lo) break;
            }
            //在大循环中判断是否会越界
            if (lp >= rp) {
                break;
            }

            int tmp = arr[lp];
            arr[lp] = arr[rp];
            arr[rp] = tmp;

        }

        arr[lo] = arr[rp];
        arr[rp] = key;

        return rp;
    }
}
