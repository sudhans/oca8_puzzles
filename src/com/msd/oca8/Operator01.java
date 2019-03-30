package com.msd.oca8;

public class Operator01 {

    public static void main(String... args) {
        int i = -20;
        float f = 20.0f;
        float nf = -20.0f;
        System.out.println("Mod operator on negative int will work " + i%3); // -2
        System.out.println("Mod operator on negative int will work " + i%3.0f); // -2.0
        System.out.println("Mod operator on positive float will work " + f%3); // 2.0
        System.out.println("Mod operator on positive float will work " + f%3.0); // 2.0
        System.out.println("Mod operator on negative float will work " + nf%3.0); // -2.0
    }
}
