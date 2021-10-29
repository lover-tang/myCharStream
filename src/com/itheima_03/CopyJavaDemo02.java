package com.itheima_03;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyJavaDemo02 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("ConversionStreamDemo.java");

        FileWriter fw = new FileWriter("Copy.java");


//        int ch;
//        while((ch=fr.read())!=-1){
//            fw.write(ch);
//        }

        char[] chs = new char[1024];
        int len;
        while((len=fr.read(chs))!=-1){
            fw.write(new String(chs,0,len));
        }




        fr.close();
        fw.close();

    }
}
