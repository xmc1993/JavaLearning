package com.xmc.tree.heap;

/**
 * Created by xmc1993 on 16/10/26.
 * 书上称之为优先队列
 *
 */
public class HeapSort {


    public static void main(String[] args) {
        int[] arr = {-1, 3, 4, 1, 2, 6, 5, 9, 7, 8};  //-1代表不使用的0号位置
        sort(arr, 9);
        for(int i : arr){
            System.out.print(i + "->");
        }
    }


    public static void sort(int[] arr, int length){
        for(int i = length/2; i >= 1; i--){
            down(arr, i, length);
        }

        for(int j = length; j >= 1; j--){
            int tmp = arr[1];
            arr[1] = arr[length];
            arr[length] = tmp;
            down(arr, 1, j);
        }
    }

    public static void down(int[] arr, int t, int length){
        int value = arr[t];
        while(t*2 <= length){
            int child = 2*t;
            if( 2*t < length){
                child = arr[2*t] > arr[2*t+1] ? 2*t : 2*t+1;
            }
            if (arr[child] > arr[t]){
                int tmp = arr[t];
                arr[t] = arr[child];
                arr[child] = tmp;
            }
            t = child;
        }
    }
}
