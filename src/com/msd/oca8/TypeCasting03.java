package com.msd.oca8;

public class TypeCasting03 {

    public static void main(String[] args) {
        Integer integer = 10;
        Double d = 10.00;
        //integer = (Integer)d; // Compiler Error - Inconvertible Types
        int i = 10;
        double j = 10.00;
        i = (int) j;

        __(); //dobule underscore is a valid method name whereas single underscore is not

    }

    private static void __() {

    }
}
