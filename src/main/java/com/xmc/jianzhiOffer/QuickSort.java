package com.xmc.jianzhiOffer;

/**
 * Created by xmc1993 on 2017/8/21.
 */
public class QuickSort {


    public static void main(String[] args) {
        int[] arr = {1, 90, 78, 89, 12, 45, 23, 19, 58, 39, 97};
//        new QuickSort().quickSort(arr);
//        for (int i : arr) {
//            System.out.print(i + "-");
//        }

        quickSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "-");
        }
    }

    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(int[] arr, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int mi = partition(arr, lo, hi);
        quickSort(arr, lo, mi - 1);
        quickSort(arr, mi + 1, hi);
    }

    /**
     * 因为是rp指针是后执行的 所以最终交换的应该是rp指针
     * @param arr
     * @param lo
     * @param hi
     * @return
     */
    public static int partition(int[] arr, int lo, int hi) {
        int lp = lo;
        int rp = hi + 1;
        int key = arr[lo];

        while (true) {
            while (arr[++lp] < key) {
                if (lp == hi) break;
            }
            //lo作为哨兵避免越界
            while (arr[--rp] > key) {
                if (lo == rp) break;
            }
            //TODO 小于号很重要 使得逻辑清晰很多
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
