package com.xmc.backdate;

/**
 * Created by xmc1993 on 2017/2/25.
 */
public class EightQueensV3 {
    static int aux[] = new int[8];
    static int count = 0;

    public static void main(String[] args) {
        search(0);
        System.out.println(count);
    }

    static void search(int x) {
        if(x == 8){
            count++;
            return;
        }

        for(int i=0; i<8; i++){//对于每一种情况进行遍历
            boolean ok = true;
            for(int j=0; j<x; j++){
                if(j ==x  || aux[j] == i || j-x == aux[j]-i || x-j == aux[j]-i){
                    ok =false;
                    break;
                }
            }
            if (ok){
                aux[x] = i;
                search(x + 1);
            }

        }
    }
}
