package com.xmc.main;

import java.io.Serializable;
import java.util.Scanner;

public class Main implements Serializable{

    @Override
    public Main clone(){
        return null;
    }



    protected void test(){

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String pattern = in.nextLine();
        if (pattern == null || str == null) {
            System.out.println(-1);
            return;
        }
        if ("".equals(pattern)) {
            System.out.println(1);
            return;
        }

//        Pattern pat = Pattern.compile(pattern);
//        Matcher matcher = pat.matcher(str);
//        System.out.println(matcher.matches());
        System.out.println(filter(str, pattern));
    }

    public static int filter(String str, String pattern) {
        int sPtr = 0, pPtr = 0;
        char[] sChs = str.toCharArray();
        char[] pChs = pattern.toCharArray();
        int pLen = sChs.length;
        int sLen = pChs.length;


        for (; pPtr < pLen; pPtr++) {
            if (sPtr >= sLen) return -1;

            if (pChs[pPtr] == '*') {
                pPtr++;

                if (pChs[pPtr] == '?') {
                    continue;
                }

                while (sPtr < sLen && sChs[sPtr] != pChs[pPtr]) {
                    sPtr++;
                }

            } else if (pChs[pPtr] == '?') {
                //无条件前进一格
                sPtr++;
            } else {
                //如果当前不匹配
                if (sChs[sPtr] != pChs[pPtr]) {
                    return -1;
                }
                sPtr++;
            }
        }

        if (pChs[pLen - 1] != '*' && sPtr < sLen) {
            return -1;
        }
        return 1;
    }


}
