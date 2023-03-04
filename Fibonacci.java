package com.practice.java;

public class Fibonacci
{
    public static void main(String[] args)
    {
        int a = 1;
        int b = 1;
//        int c = 2;

        for (int i = 0; i < 10; i++)
        {
            int c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }
}
