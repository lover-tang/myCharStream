package com.itheima_06;

public class Student {
    private String sid;
    private String name;
    private int age;
    private String address;

    public Student() {
    }

    public Student(String sid, String name, int age, String address) {
        this.name = sid;
        this.sid = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
