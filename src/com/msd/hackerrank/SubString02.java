package com.msd.hackerrank;


public class SubString02 {
    public static void main(String[] args) {
        String s = "welWe lwel";
        int k = 3;
        System.out.println(getSmallestAndLargest(s, k));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String[] subStrings = new String[s.length() - (k - 1)];
        for (int i = 0; i < s.length() - (k - 1); i++) {
            subStrings[i] = (s.substring(i, i + k));
        }
        sortArray(subStrings);
        smallest = subStrings[0];
        largest = subStrings[subStrings.length - 1];
        return smallest + "\n" + largest;
    }

    private static void sortArray(String[] strArray) {
        String temp;
        for (int i = 1; i < strArray.length; i++) {
            for (int j = i; j > 0; j--) {
                if (strArray[j].compareTo(strArray[j - 1]) <= 0) {
                    temp = strArray[j];
                    strArray[j] = strArray[j - 1];
                    strArray[j - 1] = temp;
                }
            }
        }
    }
}
