package com.itheima_04;

import java.io.*;

public class CopyJavaDemo02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("ConversionStreamDemo.java"));

        BufferedWriter bw = new BufferedWriter(new FileWriter("Copy.java"));

        String line;
        while((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        br.close();
        bw.close();


    }
}
