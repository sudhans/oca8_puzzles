package com.msd.oca8;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        char[] c1 = {'a', 'b', 'c', 'd'};
        char[] c2 = {};
        char[] c3 = {'a', 'c'};
        char[] c4 = null;
        int i1 = Arrays.compare(c1, c2); // 4
        int i2 = Arrays.compare(c1, c3); // -1
        int i3 = Arrays.compare(c1, c4); // 1
        int i4 = Arrays.compare(c2, c3); // -2


        int i5 = Arrays.mismatch(c1, c2); // 0 - first index of mismatch, if both arrays are same returns -1
        int i6 = Arrays.mismatch(c1, c3); // 1
        //int i7 = Arrays.mismatch(c1, c4); // Null pointer exception

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);
        System.out.println(i6);
        // System.out.println(i7);
    }
}
