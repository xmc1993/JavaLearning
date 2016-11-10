package com.xmc.algorithm;

/**
 * Created by xmc1993 on 16/11/10.
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 1, 7, 9, 0, 6, 12, 67, 45, 34, 65, 122};
        quickSort(arr);

        for (int i : arr) {
            System.out.print(i + "->");
        }
        System.out.println("");

//        for(int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + "->");
//        }

    }

    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(int[] arr, int lo, int hi) {
        if (lo >= hi) return;
        int partition = partition(arr, lo, hi);
        quickSort(arr, lo, partition - 1);
        quickSort(arr, partition + 1, hi);
    }

    public static int partition(int[] arr, int lo, int hi) {
        int key = arr[lo];
        int loPtr = lo;
        int hiPtr = hi + 1;

        while (true) {
            while (key > arr[++loPtr]) {
                if (loPtr == hi) break;
            }
            while(arr[--hiPtr] > key){
                if(hiPtr == lo) break;
            }
            if(loPtr >= hiPtr) break;

            //exchange
            int tmp = arr[loPtr];
            arr[loPtr] = arr[hiPtr];
            arr[hiPtr] = tmp;

        }
        arr[lo] = arr[hiPtr];
        arr[hiPtr] = key;

        return hiPtr;
    }
}
