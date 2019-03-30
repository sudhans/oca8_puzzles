package com.msd.oca8;

public class Operator03 {

    public static void main (String... args) {
        Short i = 100;
        Integer j = 100;
        String s = "X";
        char c = 'c';
        Boolean b = false;

        j = (int) i.shortValue(); // Valid
        s+=b; // Valid
        b = !b; // Valid
        //c=i;  // Compilation Error
        //c=i.shortValue(); // Compilation Error
        c*=i; // valid --> compound statements do auto type casting

        int a1 = 100;
        long b1 = 100;
        //a1 = a1 + b1;  // Compilation Error
        a1+=b1;   // Valid --> compound statements do auto type casting.

        short s1 = 100;
        s1 += 50.5; // Valid, s1 is now 150
        System.out.println("s1 is :: " + s1);
    }
}
