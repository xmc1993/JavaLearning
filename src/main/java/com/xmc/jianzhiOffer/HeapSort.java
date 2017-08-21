package com.xmc.jianzhiOffer;

/**
 * Created by xmc1993 on 2017/8/21.
 */
public class HeapSort {

    public static void main(String[] args) {
        int[] arr = {1, 90, 78, 89, 12, 45, 23, 19, 58, 39, 97};

        headSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "-");
        }
    }

    public static void headSort(int[] arr) {
        int max = arr.length - 1;
        for (int i = max/2; i >= 0; i--) {
            sink(arr, i, max);
        }
        int ptr = max;
        while(ptr >= 0){
            int tmp = arr[0];
            arr[0] = arr[ptr];
            arr[ptr] = tmp;
            max--;
            ptr--;
            sink(arr, 0, ptr);
        }

    }


    /**
     * 元素下潜
     *
     * @param arr
     * @param cur
     * @param max
     */
    public static void sink(int[] arr, int cur, int max) {
        while (getLeftChild(cur) <= max) {
            if (getRightChild(cur) <= max) {
                int maxChild = arr[getLeftChild(cur)] > arr[getRightChild(cur)] ? getLeftChild(cur) : getRightChild(cur);
                if (arr[maxChild] > arr[cur]) {
                    int tmp = arr[maxChild];
                    arr[maxChild] = arr[cur];
                    arr[cur] = tmp;
                    cur = maxChild;
                }else {
                    break;
                }
            } else {
                if (arr[getLeftChild(cur)] > arr[cur]) {
                    int tmp = arr[cur];
                    arr[cur] = arr[getLeftChild(cur)];
                    arr[getLeftChild(cur)] = tmp;
                    cur = getLeftChild(cur);
                }else {
                    break;
                }
            }
        }
    }


    public static int getLeftChild(int cur) {
        return cur * 2 + 1;
    }

    public static int getRightChild(int cur) {
        return cur * 2 + 2;
    }

}
