package com.itheima_02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"));


//        osw.write(97);
//        osw.flush();
//        osw.write(98);
//        osw.flush();
//        osw.write(99);

        char[] chs = {'a','b','c','d','e'};
//        osw.write(chs);

//        osw.write(chs,1,3);

//        osw.write("abcde");

        osw.write("abcde",1,3);




        osw.close();



    }
}
