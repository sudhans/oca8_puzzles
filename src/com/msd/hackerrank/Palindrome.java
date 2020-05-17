package com.msd.hackerrank;

public class Palindrome {

    public static void main(String[] args) {
        String A = "madami";
        char[] reverseA = new char[A.length()];

        for (int i = A.length() - 1, j = 0; i >= 0; i--, j++) {
            reverseA[j] = A.charAt(i);
        }

        System.out.println(A.equals(String.valueOf(reverseA)) ? "Yes" : "No");
    }
}
