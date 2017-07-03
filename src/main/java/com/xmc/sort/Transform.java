package com.xmc.sort;


public class Transform{
    public static String[] table = new String[128];

    static {
        table['A'] = "._";
        table['B'] = "-...";
        // TODO Ê¡ÂÔ...
        table['Z'] = "--..";
        table['0'] = "-----";
        //TODO Ê¡ÂÔ...
        table['0'] = "----.";

    }

    public static void main(String[] args){

    }

    public static String stringToMorse(String str){
        char[] chars = str.toCharArray();
        String res = "";
        for (int i = 0; i < chars.length; i++) {
            res += table[chars[i]];
        }
        return res;
    }


    public static String MorseToString(String morse){
        return null;
    }
}
