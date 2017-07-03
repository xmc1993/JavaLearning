package com.xmc.array;

/**
 * Created by xmc1993 on 2017/6/28.
 * <p>
 * 二维数组中的查找/杨氏三角问题
 */
public class ArrayFind {

    static int[][] arr = {
            {1, 2, 8, 9},
            {2, 4, 9, 12},
            {4, 7, 10, 13},
            {6, 8, 11, 15}
    };

    public static void main(String[] args) {
        System.out.println(find(arr, 1));
        System.out.println(find(arr, 100));
        System.out.println(find(arr, 9));
        System.out.println(find(arr, 77));
        System.out.println(find(arr, 15));
    }

    static boolean find(int[][] arr, int key){
        return find(arr, key, 0, arr[0].length - 1);
    }

    /**
     * 每次排除一行或者一列复杂度为 m + n
     * @param arr
     * @param key
     * @return
     */
    static boolean find(int[][] arr, int key, int x, int y) {
        if (x == arr.length || y < 0) return false;
        if (arr[x][y] == key) return true;
        if (arr[x][y] > key) {
            y--;
        }else {
            x++;
        }
        return find(arr, key, x, y);
    }


}
