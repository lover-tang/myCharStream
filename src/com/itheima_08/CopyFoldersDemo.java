package com.itheima_08;

import java.io.*;

public class CopyFoldersDemo {
    public static void main(String[] args) throws IOException{
        File srcFile = new File("D:\\StudyData\\IDEA\\itcast");

//        String srcFolderName = srcFolder.getName();

        File destFile = new File("D:\\");

        copyFolder(srcFile,destFile);

//        if(!destFolder.exists()){
//            destFolder.mkdir();
//        }
//
//        File[] listFiles = srcFolder.listFiles();
//        for(File srcFile : listFiles){
//            if(srcFile.isDirectory()){
//
//            }
//        }

    }

    private static void copyFolder(File srcFile, File destFile) throws IOException{
        if(srcFile.isDirectory()){
            String srcFileName = srcFile.getName();
            File newFolder = new File(destFile,srcFileName);
            if(!newFolder.exists()){
                newFolder.mkdir();
            }

            File[] filesArray = srcFile.listFiles();
            for(File file : filesArray){
                copyFolder(file,newFolder);
            }

        } else {
            File newFile = new File(destFile,srcFile.getName());
            copyFile(srcFile, newFile);
        }

    }

    public static void copyFile(File srcFile, File destFile)throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));

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
