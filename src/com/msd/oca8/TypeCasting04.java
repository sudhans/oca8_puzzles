package com.msd.oca8;

public class TypeCasting04 {

    public static void main(String[] args) {
        short s = 10;
        char c = (char) s; // Requires implicit cast here
        s = (short) c;   // Requires implicit cast here

    }
}
