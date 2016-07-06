package com.xmc.main;


import java.io.*;
import java.util.ArrayList;

/**
 * Created by xmc1993 on 16/7/3.
 */
public class XiaNan {
    public static void main(String[] args){
        process();
    }



    public static void process(){
        String file_1 = "chick.txt";
        String file_2 = "monkey.txt";
        String file_3 = "pig.txt";
        String file_4 = "excepted.txt";

        char[] arr_chick = readFile(file_1).toCharArray();
        char[] arr_monkey = readFile(file_2).toCharArray();
        char[] arr_pig = readFile(file_3).toCharArray();
        char[] arr_excepted = readFile(file_4).toCharArray();

        ArrayList<Character> list_chick = new ArrayList<Character>();
        ArrayList<Character> list_monkey = new ArrayList<Character>();
        ArrayList<Character> list_pig = new ArrayList<Character>();

        for (char c : arr_chick) {
            list_chick.add(c);
        }

        for (char c : arr_monkey) {
            list_monkey.add(c);
        }

        for (char c : arr_pig) {
            list_pig.add(c);
        }
        System.out.println(list_chick.size()+ "-----------------");


        for (char c : arr_excepted) {
            if(list_chick.contains(c)){
                list_chick.remove((Character)c);
            }
            if(list_monkey.contains(c)){
                list_monkey.remove((Character)c);
            }
            if(list_pig.contains(c)){
                list_pig.remove((Character)c);
            }
        }

        System.out.println(list_chick.size()+ "-----------------");

        //生成结果

        File file1 = new File("/Users/xmc1993/Desktop/chick-pig.txt");
        File file2 = new File("/Users/xmc1993/Desktop/monkey-pig.txt");
        try {
            if(!file1.exists()) {
                file1.createNewFile();
            }
            FileWriter fw1 = new FileWriter(file1);
            PrintWriter out1 = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file1))));

            if(!file2.exists()) {
                file2.createNewFile();
            }
            FileWriter fw2 = new FileWriter(file2);
            PrintWriter out2 = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2))));

            for (Character character : list_chick) {
                for (Character character1 : list_pig) {
                    String res = character + "" + character1 + "," + character1 + character + "  ";
                    System.out.println(res);
                    out1.write(res);
                }
            }

            for (Character character : list_monkey) {
                for (Character character1 : list_pig) {
                    String res = character + "" + character1 + "," + character1 + character + "  ";
                    System.out.println(res);
                    out2.write(res);
                }
            }




            out1.flush();
            out1.close();

            out2.flush();
            out2.close();
        } catch (IOException e) {


        }







    }



    public static String readFile(String fileName){
        String baseUrl = "/Users/xmc1993/Desktop/";
        baseUrl += fileName;
        System.out.println(baseUrl);
        File file = new File(baseUrl);
        String result = "";
        String temp = "";
        try {
            FileReader reader = new FileReader(file);
            BufferedReader br =new BufferedReader(reader);
            while((temp = br.readLine()) != null){
                result += temp;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;

    }

    public static void writeFile(){

    }
}
