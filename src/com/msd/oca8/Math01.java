package com.msd.oca8;

public class Math01 {

    public static void main(String... args) {
        System.out.println(Math.round(-0.5)); // 0
        System.out.println(Math.round(0.5));  // 1
        System.out.println(Math.round(0.4));  // 0
        System.out.println(Math.round(0.9));  // 1

        System.out.println(Math.round(-1.5));  // -1
    }
}
