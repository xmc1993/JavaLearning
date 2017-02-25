package com.xmc.findk;

/**
 * Created by xmc1993 on 2017/2/25.
 */
public class FindKByQuick {

    public static void main(String[] args) {
        int[] array = {10, 9, 5, 7, 8, 6, 1, 3, 4, 5, 2};
        System.out.println(find(array, 6));
    }

    public static int find(int[] array, int k) {
        int lo = 0;
        int hi = array.length - 1;
        int m = partition(array, lo, hi);
        while ( m != (k-1)){
            if (m < (k-1)){
                lo = m + 1;
                m = partition(array, lo, hi);
            }else if (m > (k-1)){
                hi = m - 1;
                m = partition(array, lo, hi);
            }
        }
        return array[k-1];
    }

    public static int partition(int[] array, int lo, int hi) {
        int pivot = array[lo];
        int i = lo;
        int j = hi + 1;
        while(true){
            while(array[++i] < pivot){
                if (i == hi) break;
            }
            while (array[--j] > pivot){
                if (j == lo) break;
            }
            if (i >= j) break;
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        array[lo] = array[j];
        array[j] = pivot;
        return j;
    }
}
