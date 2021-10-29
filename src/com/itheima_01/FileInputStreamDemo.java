package com.itheima_01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamDemo{
    public static void main(String[] args) throws IOException {
//        FileInputStream fis = new FileInputStream("a.txt");
//
//        int by;
//        while((by=fis.read())!=-1){
//            System.out.println((char)by);
//
//        }
//        fis.close();

        //String s = "abc";//[97, 98, 99]
        String s = "中国";//[-28, -72, -83, -27, -101, -67]
//        byte[] bys = s.getBytes("UTF-8");//[-28, -72, -83, -27, -101, -67]
        byte[] bys = s.getBytes("GBK");//[-42, -48, -71, -6]
        System.out.println(Arrays.toString(bys));



    }

}
