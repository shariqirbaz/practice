package com.practice.java;

public class Palindrome
{

    public static boolean isPalindrome(String str)
    {
        char[] charArray = str.toCharArray();

        for (int i = 0; i < str.length(); i++)
        {
            if (charArray[i] != charArray[str.length() - 1 - i])
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        String str1 = "shariq";
        String str2 = "radar";
        String str3 = "redivider";

        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));
        System.out.println(isPalindrome(str3));
    }
}
