package com.itheima_03;

import java.io.*;

public class CopyJavaDemo01 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("ConversionStreamDemo.java"));

        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("Copy.java"));

//        int ch;
//        while((ch=isr.read())!=-1){
//            osw.write(ch);
//        }

        char[] chs = new char[1024];
        int len;
        while((len=isr.read(chs))!=-1){
            osw.write(new String(chs,0,len));
        }




        isr.close();
        osw.close();

    }
}
