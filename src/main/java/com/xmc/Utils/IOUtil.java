package com.xmc.Utils;

import java.io.*;

/**
 * Created by xmc1993 on 16/7/6.
 */
public final class IOUtil {

    private IOUtil() {
    }

    public static void readFile(String url) throws IOException {
        File file = new File(url);
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
    }

    public static void writeFile(String url, String content) throws IOException {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(url))));
            bufferedWriter.write(content);
            bufferedWriter.append(content);
        } catch (FileNotFoundException e) {
            throw e;
        } catch (IOException e) {
            throw e;
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                }catch (Exception e){

                }
            }
        }

    }


}
