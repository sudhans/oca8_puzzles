package com.msd.oca8;

public class TypeCasting01 {

    public static void main (String... args) {
        int i = 1234567890;
        float f = i;

        System.out.println("Value of i - f is " +  (i - f)); // prints 0.0
        System.out.println("Value of f - i is " +  (f - i)); // prints 0.0
        System.out.println("Value of i - int of f is " +  (i - (int)f)); // prints -46
    }
}
