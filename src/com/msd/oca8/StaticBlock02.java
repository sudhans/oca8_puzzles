package com.msd.oca8;

public class StaticBlock02 {

    public static void main(String[] args) {
        System.out.println(Sub.SUP_ID); // This won't print the statement in Sub's static block
    }
}

class SuperClass {
    static final String SUP_ID = "SUP_ID";
}

class Sub extends SuperClass {
    static {
        System.out.println("Print Me First");
    }
}


/*
 A class or interface type T will be initialized immediately before the first occurrence of any one of the following:

 T is a class and an instance of T is created.

 T is a class and a static method declared by T is invoked.

 A static field declared by T is assigned.

 A static field declared by T is used and the field is not a constant variable (§4.12.4).

 T is a top level class (§7.6), and an assert statement (§14.10) lexically nested within T (§8.1.3) is executed.

 A reference to a static field (§8.3.1.1) causes initialization of only the class or interface that actually declares it, even though it might be referred to through the name of a subclass, a subinterface, or a class that implements an interface.

 Invocation of certain reflective methods in class Class and in package java.lang.reflect also causes class or interface initialization.

 A class or interface will not be initialized under any other circumstance

 */