package com.practice.java;

public class Singleton
{
    private String str = null;

    private static Singleton singleton = null;
    private Singleton()
    {

    }

    public static Singleton getInstance()
    {
        if (singleton == null)
        {
            singleton = new Singleton();
        }
        return singleton;
    }

    public static void main(String... args)
    {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        singleton1.str = "Shariq";
        singleton2.str = "Irbaz";

        System.out.println(singleton1.str);
        System.out.println(singleton2.str);

    }
}
