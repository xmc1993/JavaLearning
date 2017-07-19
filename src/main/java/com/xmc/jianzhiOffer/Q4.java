package com.xmc.jianzhiOffer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * 替换字符串中的空格 已完成
 * Created by xmc1993 on 2017/7/4.
 */
public class Q4 {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dataformat=new SimpleDateFormat("yyyy-MM-dd");
        Date parse = dataformat.parse("2017-10-2");
        System.out.println(parse);
    }

    public static void method() {

    }
}
