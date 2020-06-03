package com.msd.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class BigInteger02 {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        //Write your code here
        sort(s);

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }

    private static void sort(String[] str) {
        String temp = null;
        for (int i = 1; i < str.length; i++) {
            for (int j = i; j > 0; j--) {
                String aStr = str[j].startsWith(".") ? "0" + str[j] : str[j];
                System.out.println("aStr = " + aStr);
                String bStr = str[j - 1].startsWith(".") ? "0" + str[j - 1] : str[j - 1];
                System.out.println("bStr = " + bStr);
                BigInteger a = new BigInteger(aStr);
                BigInteger b = new BigInteger(bStr);

                if (b.compareTo(a) > 0) {
                    temp = str[j];
                    str[j] = str[j - 1];
                    str[j - 1] = temp;
                }
            }
        }
    }

    private static String sort(String str) {
        char temp;
        char[] charArray = str.toCharArray();
        for (int i = 1; i < charArray.length; i++) {
            for (int j = i; j > 0; j--) {
                if (charArray[j] <= charArray[j - 1]) {
                    temp = charArray[j];
                    charArray[j] = charArray[j - 1];
                    charArray[j - 1] = temp;
                }
            }
        }
        return String.valueOf(charArray);
    }
}
