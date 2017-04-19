package com.xmc.backdate;

/**
 * Created by xmc1993 on 17/2/17.
 */
public class Horse {
    public static int[] xs = {2, 1, -2, -1, -2, -1, 2, 1};
    public static int[] ys = {1, 2, 1, 2, -1, -2, -1, -2};
    public static int count = 0;
    static int m = 4;
    static int n = 5;
    public static boolean[][] visited = new boolean[m][n];

    public static int X = 0;  //4596
    public static int Y = 0;

    public Horse(){
        System.out.println(this.xs);
    }

    public static void main(String[] args) {
//        for (int i=0; i<8; i++){
//            search(X + xs[i], Y + ys[i]);
//        }
//        System.out.println(count);
//        int a =9, b = 2;
//        float f;
//        f = a/b;
//        double a = -27.122;
        int x = -1;
        int t1 = x >>> 0;
        int t2 = x >>> 32;
        int t3 = x >>> 1;
        int t4 = x >> 32;
        int t5 = x >> 1;


        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        System.out.println(t4);
        System.out.println(t5);

//        boolean b = false;

    }

    public static void search(int x, int y) {
        if(x == X && y == Y){
            count++;
            return;
        }
        if(x>=0 && x<m && y>=0 && y<n && visited[x][y]==false){
            visited[x][y] = true;
            for (int i=0; i<8; i++){
                search(x+xs[i], y+ys[i]);
            }
            visited[x][y]=false;
        }

    }


    public static void searchV2(int x, int y){
        if(x == X && y == Y && visited[x][y]){
            count++;
            return;
        }

        if(x>=0 && x<m && y>=0 && y <n && visited[x][y]==false){
            visited[x][y] = true;
            for (int i=0; i<8; i++){
                search(x+xs[i], y+ys[i]);
            }
            visited[x][y]=false;
        }
    }




}
