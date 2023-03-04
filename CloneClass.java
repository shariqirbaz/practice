package com.practice.testProject;

import java.util.ArrayList;
import java.util.List;

public class CloneClass implements Cloneable {

    int a = 3;

    List<Student> list = new ArrayList<>();

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    public void addStudent()
    {
        for (int i = 0; i < 5; i ++)
        {
            Student s = new Student();
            s.setName("shariq" + i);
            this.list.add(s);
        }
    }


    //Shallow Copy
//	protected Object clone() throws CloneNotSupportedException {
//		return super.clone();
//	}

    //Deep Copy
    protected Object clone() throws CloneNotSupportedException
    {
        CloneClass c = new CloneClass();
        c.a = this.a;
        c.getList().addAll(this.getList());
        return c;
    }

    @Override
    public String toString() {
        return "CloneClass{" +
                "a=" + a +
                ", list=" + list +
                '}';
    }

}