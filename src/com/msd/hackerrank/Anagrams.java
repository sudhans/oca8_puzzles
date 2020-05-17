package com.msd.hackerrank;

public class Anagrams {
    public static void main(String[] args) {
        String a = "anagrams";
        String b = "Anagrams";
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        a = sortString(a);
        b = sortString(b);
        return a.equals(b);
    }

    private static String sortString(String str) {
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
