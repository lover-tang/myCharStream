package com.itheima_08;

import java.io.*;


public class CopyFolderDemo {
    public static void main(String[] args) throws IOException{
        File srcFolder = new File("D:\\StudyData\\IDEA\\itcast");

        String srcFolderName = srcFolder.getName();

        File destFolder = new File(srcFolderName);

        if(!destFolder.exists()){
            destFolder.mkdir();
        }

        File[] listFiles = srcFolder.listFiles();
        for(File src : listFiles){
            String name = src.getName();

            File destFile = new File(destFolder,name);

            copyFile(src,destFile);
        }

    }

    public static void copyFile(File src, File destFile)throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

        byte[] bys = new byte[1024];
        int len;
        while((len=bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }

        bis.close();
        bos.close();


    }
}
