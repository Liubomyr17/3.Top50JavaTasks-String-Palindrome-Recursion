package com.company;

/**
 * Here is the complete Java program to check if given String is palindrome or not.
 * In this program, we have used Recursion to first reverse the String and then check
 * if both original and reversed String is the same or not.
 */

public class PalindromeTester {
    public static void main(String[] args) {
        System.out.println("Is aaa palindrome? :" + isPalindromeString("aaa"));
        System.out.println("Is abc palindrome? :" + isPalindromeString("abc"));
        System.out.println("Is bbb palindrome? :" + isPalindromeString("bbb"));
        System.out.println("Is del palindrome? :" + isPalindromeString("del"));
    }
    public static boolean isPalindromeString(String text) {
        String reverse = reverse(text);
        return text.equals(reverse);
    }
    public static String reverse(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        return input.charAt(input.length() - 1)
                + reverse(input.substring(0, input.length() - 1));
    }
}

