package com.msd.oca8;

public class Override02 {

    public static void main(String... args) {
        A a = new C();
        B b = (B) a;

        System.out.println(b.i);  // Prints 20 - variables are determined by the declared class type
        System.out.println(b.m1()); // Prints 30 - methods are determined by the actual class of the object
    }
}

// Variable can be shadowed
// Methods can be overridden

class A {
    int i = 10;

    int m1() {
        return i;
    }
}

class B extends A {
    int i = 20;

    int m1() {
        return i;
    }
}

class C extends B {
    int i = 30;

    int m1() {
        return i;
    }
}
