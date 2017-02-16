package com.xmc.sort;

/**
 * Created by xmc1993 on 16/10/31.
 */
public class Sort {

    public static void quickSort(int[] arr){

    }

    public static void quickSort(int[] arr, int low, int high){

    }

    public static void partation(int[] arr, int low, int high){
        int key = arr[low];
        int m = low;
        int n = high + 1;
        while(true){
            while(arr[++m] > key) if (m == n) return;
            while(arr[--n] < key)if(m == n) return;
            if(m >= n) return;
        }
//        if()
    }

    private static void exchange(int[] arr, int x, int y){
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;

    }
}
