package com.msd.oca8;

public class Float01 {

    static float f = 10.3f;
    float g = 14e5f;
    float h = -1;
    float i = 0x1234;
    float j = 10;
//    float f1 = 10.0;  // compilation error - double
//    float g1 = 14e5;  // compilation error - double

    static int i1 = 10;

    public static void main(String[] args) {
        System.out.println(new Boolean("tRue"));
        if (i1 == f) {
            System.out.println("Different data types (int / float) can be compared with == ");

        }
    }




}
