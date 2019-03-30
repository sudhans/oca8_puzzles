package com.msd.oca8;

public class Static02 {


    public static final String url = "https://www.google.co.in";

    static Static02 staticFactory() {
        System.out.println("From Static Factory.. ");
        return null;
    }

    public static void main(String... args) {
        System.out.println(staticFactory().url); // No null pointer exception here.
        // com.msd.oca8.A null reference may be used to access a class's static variable
    }
}
