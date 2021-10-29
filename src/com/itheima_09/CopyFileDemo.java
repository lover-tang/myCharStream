package com.itheima_09;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileDemo {
    public static void main(String[] args) {


    }

    public static void method4() throws IOException{
        FileWriter fw = new FileWriter("fw.txt");
        FileReader fr = new FileReader("fr.txt");
        try(fr;fw){

            char[] chs = new char[1024];
            int len;
            while((len=fr.read())!=-1){
                fw.write(chs,0,len);
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void method3() {
        try(FileWriter fw = new FileWriter("fw.txt");
            FileReader fr = new FileReader("fr.txt");){

            char[] chs = new char[1024];
            int len;
            while((len=fr.read())!=-1){
                fw.write(chs,0,len);
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void method2() {
        FileWriter fw = null;
        FileReader fr = null;
        try{
            fw = new FileWriter("fw.txt");
            fr = new FileReader("fr.txt");

            char[] chs = new char[1024];
            int len;
            while((len=fr.read())!=-1){
                fw.write(chs,0,len);
            }

        } catch(IOException e){
            e.printStackTrace();
        } finally {
            if(fr!=null){
                try{
                    fr.close();
                } catch(IOException e){
                    e.printStackTrace();
                }
            }
            if(fw!=null){
                try{
                    fw.close();
                } catch(IOException e){
                    e.printStackTrace();
                }
            }


        }

    }
    public static void method1()throws IOException {
        FileWriter fw = new FileWriter("fw.txt");
        FileReader fr = new FileReader("fr.txt");

        char[] chs = new char[1024];
        int len;
        while((len=fr.read())!=-1){
            fw.write(chs,0,len);
        }
        fr.close();
        fw.close();
    }
}
