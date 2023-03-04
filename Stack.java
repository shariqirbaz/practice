package com.practice.datastructure;

import java.util.ArrayList;
import java.util.List;

public class Stack
{
    int top;
    int[] array;

    Stack()
    {
        array = new int[5];
        top = -1;
    }

    public void push(int a)
    {
        array[++top] = a;
    }

    public int pop()
    {
        return array[top--];
    }

    public static void main(String... args)
    {
        Stack stack = new Stack();

        stack.push(3);
        stack.push(4);
        stack.push(1);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
