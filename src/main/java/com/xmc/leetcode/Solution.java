package com.xmc.leetcode;

/**
 * Created by xmc1993 on 17/2/20.
 */
public class Solution {


    public static void main(String[] args){
        char[][] board = {
                {'X','O','X', 'X'},
                {'O','X','O', 'X'},
                {'X','O','X', 'O'},
                {'O','X','O', 'X'},
                {'X','O','X', 'O'},
                {'O','X','O', 'X'}
        };

        new Solution().solve(board);

        String s = "string";
    }


    public void solve(char[][] board) {
        int len1 = board.length;
        if (len1 == 0) return;
        int len2 = board[0].length;

        UF uf = new UF(len1 * len2 + 1);

        for (int i = 0; i< len1; i++){
            for(int j = 0; j < len2; j++){
                if ((i == 0 || j == 0 || i == len1 - 1 ||j == len2 - 1) && board[i][j] == 'O') {
                    uf.union(len1*len2, i * len2 + j);
                }else if(board[i][j] == 'O'){
                    if ((i + 1) < len1 && board[i+1][j] == 'O') {
                        uf.union(i*len2+j, (i+1)*len2+j);
                    }
                    if((j+1)<len2 && board[i][j+1] == 'O'){
                        uf.union(i*len2+j, i*len2+j+1);
                    }
                }
            }
        }

        for(int i = 0; i < len1; i++){
            for(int j =0; j< len2; j++){
                if(!uf.isConnected(i*len2+j, len1*len2)){
                    board[i][j] = 'X';
                }
            }
        }

    }
}

class UF{
    int[] ufs;
    int[] sz;
    int count;

    public UF(int num){
        ufs = new int[num];
        sz = new int[num];
        count = num;
        for(int i = 0; i < num; i++){
            ufs[i] = i;
            sz[i] = 0;
        }
    }

    public int getCount(){
        return count;
    }

    public int find(int p){
        while(ufs[p] != p){
            ufs[p] = ufs[ufs[p]];//路径压缩
            p = ufs[p];
        }
        return p;
    }

    public boolean isConnected(int p, int q){
        return find(p) == find(q);
    }

    public void union(int p, int q){
        int pRoot = ufs[p];
        int qRoot = ufs[q];
        if(pRoot == qRoot) return;
        if(sz[pRoot] > sz[qRoot]){
            ufs[qRoot] = pRoot;
        }else if(sz[pRoot] < sz[qRoot]){
            ufs[pRoot] = qRoot;
        }else{
            ufs[qRoot] = pRoot;
            sz[pRoot]++;
        }
        count--;
    }

}
