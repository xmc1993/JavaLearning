package com.xmc.jianzhiOffer;

/**
 * Created by xmc1993 on 2017/8/21.
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1, 90, 78, 89, 12, 45, 23, 19, 58, 39, 97};

        mergeSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "-");
        }
    }

    public static void mergeSort(int[] arr) {
        int[] aux = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1, aux);
    }

    public static void mergeSort(int[] arr, int lo, int hi, int[] aux) {
        if (lo >= hi) return;
        int mi = (lo + hi)/2;
        mergeSort(arr, lo, mi, aux);
        mergeSort(arr, mi + 1, hi, aux);
        merge(arr, lo, mi, hi, aux);
    }

    public static void merge(int[] arr, int lo, int mi, int hi, int[] aux) {
        for (int i = lo; i <= hi; i++) {
            aux[i] = arr[i];
        }
        int lp = lo;
        int rp = mi + 1;

        for (int j = lo; j <= hi; j++) {
            if (lp > mi) {
                arr[j] = aux[rp++];
            } else if (rp > hi) {
                arr[j] = aux[lp++];
            } else if (aux[lp] <= aux[rp]) {
                arr[j] = aux[lp++];
            } else {
                arr[j] = aux[rp++];
            }
        }
    }

}
