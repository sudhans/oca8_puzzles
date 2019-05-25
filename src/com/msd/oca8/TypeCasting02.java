package com.msd.oca8;

import java.util.Arrays;

public class TypeCasting02 {

    public static void main(String[] args) {
        int[] intarr1 = {1, 2, 3, 4, 5};
        Object obj1 = intarr1;
        Object obj2 = new int[]{6, 7, 8};
        int[] intarr2 = (int[]) obj1;
        int[] intarr3 = (int[]) obj2;
        System.out.println(Arrays.toString(intarr2)); //[1, 2, 3, 4, 5]
        System.out.println(obj2); //[I@hashcode
        System.out.println(Arrays.toString(intarr3)); // [6, 7, 8]
    }

    public static long anotherMethod(byte b) {
        double d = 10;
        //return (long) b/d;  // compilation error, the casting here applies to only b and not whole expression
        return (long) (b / d);
    }
}
