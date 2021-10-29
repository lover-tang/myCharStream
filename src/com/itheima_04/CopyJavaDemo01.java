package com.itheima_04;

import java.io.*;

public class CopyJavaDemo01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("ConversionStreamDemo.java"));

        BufferedWriter bw = new BufferedWriter(new FileWriter("Copy.java"));

//        int ch;
//        while((ch=br.read())!=-1){
//            bw.write(ch);
//        }

        char[] chs = new char[1024];
        int len;
        while((len=br.read(chs))!=-1){
            bw.write(chs,0,len);
        }




        bw.close();
        br.close();

    }
}
