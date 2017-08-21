package com.xmc.jianzhiOffer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 替换字符串中的空格 已完成
 * Created by xmc1993 on 2017/7/4.
 */
public class Q4 {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dataformat = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = dataformat.parse("2017-10-2");
        System.out.println(parse);
        System.out.println(method("  "));

    }

    public static String method(String str) {
//        char[] chs = new char[10];
        char[] in = str.toCharArray();
        int tag = 0;
        for (char c : in) {
            if (c == ' ') {
                tag++;
            }
        }
        char[] chs = new char[in.length + tag * 2];
        int lPtr = in.length - 1;
        int rPtr = chs.length - 1;
        for (int i = lPtr; i >= 0; i--) {
            if (in[i] == ' ') {
                chs[rPtr--] = '%';
                chs[rPtr--] = '0';
                chs[rPtr--] = '2';
            } else {
                chs[rPtr--] = in[i];
            }
        }

        String res = String.valueOf(chs);
        return res;
    }
}
