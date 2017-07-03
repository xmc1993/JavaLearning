package com.xmc.string;

/**
 * Created by xmc1993 on 2017/6/28.
 */
public class ReplaceSpace {

    public static void main(String[] args) {
        String test1 = "dasd dasdas dasdsa dasd dasda dasd dasdas dasd";
        String test2 = " dasd dasdas dasdsa dasd dasda dasd dasdas dasd";
        String test3 = " dasd dasdas dasdsa dasd dasda dasd dasdas dasd ";
        System.out.println(replaceSpace(test1));
        System.out.println(replaceSpace(test2));
        System.out.println(replaceSpace(test3));
    }

    static String replaceSpace(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        for (char ch : chars) {
            if (ch == ' ') {
                count++;
            }
        }
        int len = chars.length;
        count *= 2;
        count += len;
        char[] chs = new char[count];
        for (int i = 0; i < len; i++) {
            chs[i] = chars[i];
        }

        int ptr = count - 1;//最新指针
        for (int i = len - 1; i >= 0; i--) {
            if (chs[i] == ' ') {
                chs[ptr--] = '%';
                chs[ptr--] = '0';
                chs[ptr--] = '2';
            }else {
                chs[ptr--] = chs[i];
            }

        }

        return String.valueOf(chs);
    }
}
