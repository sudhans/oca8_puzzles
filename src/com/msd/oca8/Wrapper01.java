package com.msd.oca8;

public class Wrapper01 {

    public static void main(String[] args) {
        Integer i1 = 100;
        Integer i2 = new Integer(100);
        int i3 = 100;
        Byte b1 = 100;
        int i4 = b1;
        long i5 = 100;
        Long i6 = new Long(42);
        System.out.println(i1 == i2);  // false - both are wrapper objects
        System.out.println(i1.equals(i2)); // true - same data type and has same value
        System.out.println(i1 == i3); // true - one of them is primitive, unboxing happens before comparison
        System.out.println(i1 == i4); // true
        System.out.println(b1 == i4); // true
        System.out.println(b1.equals(i5)); // false - data types are different
        System.out.println(i1.equals(i5)); // false - data types are different
        System.out.println(i1.equals(b1)); // false - data types are different
        System.out.println(i6.equals(42)); // false - 42 gets auto boxed to Integer and then returns false as data types are different
        //System.out.println(com.msd.oca8.i1 == b1); //Compilation Error Integer can't be compared to Byte

        System.out.println (Boolean.valueOf(null)); // false
    }
}
