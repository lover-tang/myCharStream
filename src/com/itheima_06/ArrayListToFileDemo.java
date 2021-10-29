package com.itheima_06;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListToFileDemo {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> array = new ArrayList<Student>();

        Student s1 = new Student("itheima001","林青霞",30,"西安");
        Student s2 = new Student("itheima002","张曼玉",35,"武汉");
        Student s3 = new Student("itheima003","王祖贤",33,"郑州");

        array.add(s1);
        array.add(s2);
        array.add(s3);

        BufferedWriter bw = new BufferedWriter(new FileWriter("students.txt"));

        for(Student s : array){
            StringBuilder sb = new StringBuilder();
            sb.append(s.getSid()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());

            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();

    }
}
