package com.msd.oca8;

public class LocalVariable01 {

    //static final int p = 0;
    static int p = 0;
    //final int x; // compiler error as no default constructor initializes it
    int x; // valid, prints 0

    public static void main(String[] args) {
        int x;
        if (p < 10) {
            x = 10;
        }

        //  System.out.println(x);  Compiler Error - x may not have initialized. Had p been declared final, it would compile fine

        Integer i = 10;
        Integer j = 10;
        Integer k = new Integer(10);

        System.out.println(i == j);
        System.out.println(new LocalVariable01().x);
    }
}
