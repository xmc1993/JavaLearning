package com.xmc.algorithm;

/**
 * Created by xmc1993 on 16/11/10.
 */
public class MergeSort {

    private static int[] aux;

    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 1, 7, 9, 0, 6, 12, 67, 45, 34, 65, 122};
        mergeSort(arr);
        for (int i : arr) {
            System.out.print(i + "->");
        }
    }

    public static void mergeSort(int[] arr) {
        aux = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1);
    }

    public static void mergeSort(int[] arr, int lo, int hi) {
        if(lo >= hi) return;
        int mi = (lo + hi) / 2;
        mergeSort(arr, lo, mi);
        mergeSort(arr, mi + 1, hi);
        merge(arr, lo, mi, hi);
    }

    /**
     * merge排序中的元操作
     *
     * @param arr
     * @param lo
     * @param mi
     * @param hi
     */
    public static void merge(int[] arr, int lo, int mi, int hi) {
        if(lo >= hi) return;
        //拷贝工作
        for (int m = lo; m <= hi; m++) {
            aux[m] = arr[m];
        }

        int loPtr = lo;
        int hiPtr = mi + 1;
        for (int n = lo; n <= hi; n++) {
            if (loPtr > mi) arr[n] = aux[hiPtr++];
            else if (hiPtr > hi) arr[n] = aux[loPtr++];
            else if(aux[loPtr] <= aux[hiPtr]) arr[n] = aux[loPtr++];
            else arr[n] = aux[hiPtr++];
        }
    }
}
