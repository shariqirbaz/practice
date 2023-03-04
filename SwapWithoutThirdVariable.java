package com.practice.java;

public class SwapWithoutThirdVariable
{
    public static void main(String[] args) {
        int a = 12;
        int b = 45;

        a = a + b; //57
        b = a - b; // 57 - 45 = 12
        a = a - b;

        System.out.println(a);
        System.out.println(b);

    }
}
