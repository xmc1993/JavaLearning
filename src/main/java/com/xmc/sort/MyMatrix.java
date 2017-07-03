package com.xmc.sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ¾ØÕóÀà£¬ÊµÏÖ¾ØÕóµÄ¼Ó·¨£¬¾ØÕó³Ë·¨£¬µã³ËÒÔ¼°×ªÖÃ·½·¨
 * ÆäÖÐ¼Ó·¨ºÍµã³Ë·½·¨ÐèÒªÓÐÁ½ÖÖÊµÏÖ·½Ê½
 * 1.´«ÈëÒ»¸öMyMatrix¶ÔÏó½øÐÐ2¸ö¾ØÕóµÄ²Ù×÷
 * 2.´Ó¿ØÖÆÌ¨£¨console£©¶ÁÈëÒ»¸ö¾ØÕóÊý¾Ý£¬ÔÙ½øÐÐ²Ù×÷
 * ËùÓÐµÄÊý¾Ý¾ùÎªintÐÍ
 * ÊäÈëÊý¾Ý¾ùÄ¬ÈÏÎªÕýÈ·Êý¾Ý£¬²»ÐèÒª¶ÔÊäÈëÊý¾Ý½øÐÐÐ£Ñé
 * @author Ray Liu & Qin Liu
 *
 */
public class MyMatrix {


    private int[][] data;
    private int m; //¾ØÕóµÄµÚÒ»Î¬³¤¶È
    private int n; //¾ØÕóµÄµÚ¶þÎ¬³¤¶È


    public static void main(String[] args) {
        MyMatrix myMatrix = new MyMatrix(new int[1][1]);
        MyMatrix myMatrix1 = myMatrix.plusFromConsole();
    }

    /**
     * ¹¹Ôìº¯Êý£¬²ÎÊýÎª2Î¬intÊý×é
     * a[i][j]ÊÇ¾ØÕóÖÐµÄµÚi+1ÐÐ£¬µÚj+1ÁÐÊý¾Ý
     * @param a
     */
    public MyMatrix(int[][] a){
        this.data = a;
        m=a.length;
        n=a[0].length;
    }

    /**
     * ·µ»Ø2Î¬int¾ØÕó
     * @return int[][]
     */
    public int[][] getArray(){
        return data;
    }

    /**
     * ·µ»Ø¾ØÕóµÄµÚÒ»Î¬³¤¶È
     * @return int
     */
    public int getM(){
        return m;
    }

    /**
     * ·µ»Ø¾ØÕóµÄµÚ¶þÎ¬³¤¶È
     * @return
     */
    public int getN(){
        return n;
    }

    /**
     * ÊµÏÖ¾ØÕó¼Ó·¨£¬·µ»ØÒ»¸öÐÂµÄ¾ØÕó
     * @param B
     * @return
     */
    public MyMatrix plus(MyMatrix B){

        return null;
    }
    public int[][] plus(int a[][], int b[][]){

        return null;
    }


    /**
     * ÊµÏÖ¾ØÕó³Ë·¨£¬·µ»ØÒ»¸öÐÂµÄ¾ØÕó
     * @param B
     * @return
     */
    public MyMatrix times(MyMatrix B){

        return null;
    }

    /**
     * ÊµÏÖ¾ØÕóµÄµã³Ë£¬·µ»ØÒ»¸öÐÂµÄ¾ØÕó
     * @param b
     * @return
     */
    public MyMatrix times(int b){

        return null;
    }

    /**
     * ÊµÏÖ¾ØÕóµÄ×ªÖÃ£¬·µ»ØÒ»¸öÐÂµÄ¾ØÕó
     * @return
     */
    public MyMatrix transpose(){

        return null;
    }

    /**
     * ´Ó¿ØÖÆÌ¨¶ÁÈë¾ØÕóÊý¾Ý£¬½øÐÐ¾ØÕó¼Ó·¨£¬¶ÁÈëÊý¾Ý¸ñÊ½ÈçÏÂ£º
     * m n
     * m * n µÄÊý¾Ý·½Õó£¬ÒÔ¿Õ¸ñ¸ô¿ª
     * example:
     * 4 3
     * 1 2 3
     * 1 2 3
     * 1 2 3
     * 1 2 3
     * ·µ»ØÒ»¸öÐÂµÄ¾ØÕó
     * @return
     */
    public MyMatrix plusFromConsole(){
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        MyMatrix myMatrix = new MyMatrix(matrix);
        return myMatrix;
    }

    /**
     * ÊäÈë¸ñÊ½Í¬ÉÏ·½·¨ÏàÍ¬
     * ÊµÏÖ¾ØÕóµÄ³Ë·¨
     * ·µ»ØÒ»¸öÐÂµÄ¾ØÕó
     * @return
     */
    public MyMatrix timesFromConsole(){
        return null;
    }

    /**
     * ´òÓ¡³ö¸Ã¾ØÕóµÄÊý¾Ý
     * ÆðÊ¼Ò»¸ö¿ÕÐÐ£¬½áÊøÒ»¸ö¿ÕÐÐ
     * ¾ØÕóÖÐÃ¿Ò»ÐÐÊý¾Ý³ÊÒ»ÐÐ£¬Êý¾Ý¼äÒÔ¿Õ¸ñ¸ô¿ª
     * example£º
     *
     * 1 2 3
     * 1 2 3
     * 1 2 3
     * 1 2 3
     *
     */
    public void print(){
        for (int i = 0; i < m; i++) {
            
        }
    }

    /**
     * ÅÐ¶ÏÊÇ·ñÏàµÈµÄ·½·¨£¬¿¼Éú²»ÒªÐÞ¸Ä£¡£¡
     */
    public boolean equals(Object obj){

        if(obj instanceof MyMatrix){
            MyMatrix matrix = (MyMatrix) obj;

            if(this.data.length != matrix.data.length){
                return false;
            }

            for(int i=0 ; i<this.data.length ; ++i){
                if(!Arrays.equals(this.data[i], matrix.data[i])){
                    return false;
                }
            }

            return true;

        }else{
            return false;
        }
    }

}

