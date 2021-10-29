package com.itheima_07;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetToFileDemo {
    public static void main(String[] args) throws IOException {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s2.getSum() - s1.getSum();
                int num1 = num == 0 ? s2.getChinese() - s1.getChinese() : num;
                int num2 = num1 == 0 ? s2.getMath() - s1.getMath() : num1;
                int num3 = num2 == 0 ? s2.getName().compareTo(s1.getName()) : num2;
                return num3;
            }
        });
        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第" + (i+1) + "个学生信息");
            System.out.println("姓名：");
            String name = sc.next();
            System.out.println("语文成绩：");
            int chinese = sc.nextInt();
            System.out.println("数学成绩：");
            int math = sc.nextInt();
            System.out.println("英语成绩：");
            int english = sc.nextInt();

            Student s = new Student();
            s.setName(name);
            s.setChinese(chinese);
            s.setMath(math);
            s.setEnglish(english);

            ts.add(s);


        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("ts.txt"));

        for(Student s: ts){
            StringBuilder sb = new StringBuilder();
            sb.append(s.getName() + "," +s.getChinese()+","+s.getMath()+","+s.getEnglish()+","+s.getSum());

            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();



    }
}
