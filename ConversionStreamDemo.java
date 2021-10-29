package com.itheima_02;

import java.io.*;

public class ConversionStreamDemo {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fos = new FileOutputStream("osw.txt");
//        OutputStreamWriter osw = new OutputStreamWriter(fos);
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"));
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"),"UTF-8");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"),"GBK");
        osw.write("中国");
        osw.close();

//        InputStreamReader isr = new InputStreamReader(new FileInputStream("osw.txt"));
        InputStreamReader isr = new InputStreamReader(new FileInputStream("osw.txt"),"GBK");
        int ch;
        while((ch=isr.read())!=-1){
            System.out.println((char)ch);
        }



        isr.close();

    }
}
