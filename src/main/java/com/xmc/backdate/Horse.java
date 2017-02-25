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

    public static void main(String[] args) {
        for (int i=0; i<8; i++){
            search(X + xs[i], Y + ys[i]);
        }
        System.out.println(count);
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




}
