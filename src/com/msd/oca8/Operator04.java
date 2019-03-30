package com.msd.oca8;

public class Operator04 {

    public static void main(String... args) {
        String str1 = "one";
        String str2 = "two";

        System.out.println(str1.equals(str1=str2)); // prints false
        // First the value of str1 is evaluated. Before the equals method is called, the assignment operands are evaluated.
        // one.equals(two) is false
    }
}
