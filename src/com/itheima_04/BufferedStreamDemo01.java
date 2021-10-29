package com.itheima_04;

import java.io.*;

public class BufferedStreamDemo01 {
    public static void main(String[] args) throws IOException {
//        FileWriter fw = new FileWriter("bw.txt");
//        BufferedWriter bw = new BufferedWriter(fw);

//        BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));

//        bw.write("hello\n");
//        bw.write("world");
//        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("bw.txt"));

//        int ch;
//        while((ch=br.read())!=-1){
//            System.out.println((char)ch);
//        }

        char[] chs = new char[1024];
        int len;
        while((len=br.read(chs))!=-1){
            System.out.println(new String(chs,0,len));
        }





    }
}
