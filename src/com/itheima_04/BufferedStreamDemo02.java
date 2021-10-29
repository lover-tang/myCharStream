package com.itheima_04;

import java.io.*;

public class BufferedStreamDemo02 {
    public static void main(String[] args) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));
//
//        for (int i = 0; i < 10; i++) {
//            bw.write("hello" + i);
////            bw.write("\n");
//            bw.newLine();
//            bw.flush();
//        }
//
//
//        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("bw.txt"));

//        String line = br.readLine();
//        System.out.println(line);
//
//        line = br.readLine();
//        System.out.println(line);
//        line = br.readLine();
//        System.out.println(line);
//        line = br.readLine();
//        System.out.println(line);
//        line = br.readLine();
//        System.out.println(line);

        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }

        br.close();

    }
}
