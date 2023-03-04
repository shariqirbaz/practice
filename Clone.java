package com.practice.testProject;

public class Clone
{
    public static void main(String[] args) throws CloneNotSupportedException {

        CloneClass t1 = new CloneClass();
        t1.addStudent();


        CloneClass t2 = (CloneClass) t1.clone();

        t1.a = 4;
        t1.getList().remove(1);

        System.out.println(t1);
        System.out.println(t2);

    }
}
