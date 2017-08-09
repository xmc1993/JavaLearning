package com.xmc.september.sort;

/**
 * Created by xmc1993 on 2017/7/23.
 */
public class HeadSort {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 40, 34, 20, 30, 112, 12, 213};
        heapSort(arr);
        for (int i : arr) {
            System.out.println(i + "-");
        }
    }

    public static void heapSort(int[] arr) {
        //初始化
        for (int i = arr.length / 2; i >= 0; i--) {
            heapify(arr, i, arr.length - 1);
        }

        for (int j = 0 ; j < arr.length; j++) {
            int tmp = arr[j];
            arr[j] = arr[arr.length - 1 - tmp];
            arr[arr.length - 1 - tmp] = tmp;
        }
    }

    public static void heapify(int[] arr, int head, int hi) {

        while (getLeftChild(head) <= hi) {
            int child = getLeftChild(head);
            if (head * 2 < hi) {
                child = arr[getLeftChild(head)]
                        > arr[getLeftChild(head) + 1] ? getLeftChild(head) : getLeftChild(head) + 1;
            }

            if (arr[child] > arr[head]) {
                int tmp = arr[child];
                arr[child] = arr[head];
                arr[head] = tmp;
                heapify(arr, child, hi);
            }
        }
    }

    public static int getLeftChild(int v) {
        return (v + 1) * 2;
    }

    public void HeapSort() {

    }
}
