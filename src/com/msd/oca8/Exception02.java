package com.msd.oca8;

public class Exception02 {
    public static void main(String[] args) throws Exception {
        Exception e = null;
        //throw e; // Exception in thread "main" java.lang.NullPointerException @ this line# 6
        throw null; // // Exception in thread "main" java.lang.NullPointerException @ this line# 7
    }
}
