package com.xmc.algorithm;

/**
 * Created by xmc1993 on 17/2/17.
 */
public class Quick2Distinct {

    public static void main(String[] args) {
        int[] array1 = {4, 5, 4, 4, 4, 4, 5, 4, 5, 4, 5, 5, 5, 4};
        int[] array2 = {5, 5, 4, 4, 4, 4, 5, 4, 5, 4, 5, 5, 5, 5};
        int[] array3 = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4};

        sort(array1, 0, array1.length - 1);
        for (int i : array1) {
            System.out.print(i + "->");
        }
        System.out.println("");
        sort(array2, 0, array2.length - 1);
        for (int i : array2) {
            System.out.print(i + "->");
        }
        System.out.println("");
        sort(array3, 0, array3.length - 1);
        for (int i : array3) {
            System.out.print(i + "->");
        }
        System.out.println("");
    }

    public static void sort(int[] array, int lo, int hi) {
        int i = lo;
        int j = hi;
        int k = lo + 1;
        while (k <= j) {
            if (array[k] < array[i]) {
                swap(array, k, i++);
            } else if (array[k] > array[i]) {
                swap(array, k, j--);
            } else {
                k++;
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
