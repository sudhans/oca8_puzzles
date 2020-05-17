package com.msd.hackerrank;


public class StringTokens {
    public static void main(String[] args) {
        String s = "He_is@ a very very good boy, isn't he?";
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (!((charArray[i] >= 'A' && charArray[i] <= 'Z') || charArray[i] >= 'a' && charArray[i] <= 'z')) {
                charArray[i] = ' ';
            }
        }
        String newString = String.valueOf(charArray);
        String[] outStringArray = newString.split(" ");

        int count = 0;
        for (String value : outStringArray) {
            if (value.trim().length() > 0) {
                count++;
            }
        }
        System.out.println(count);
        for (String value : outStringArray) {
            if (value.trim().length() > 0) {
                System.out.println(value);
            }
        }
    }
}
