package com.msd.oca8;

public class Constructor03 extends Constructor04{

    private String name = "com.msd.oca8.Constructor03";

    public void printName() {
        System.out.println("Name is :: " + name);
    }

    public Constructor03() {
        // No need to call super(). It will be automatically added by the compiler, only when the parent has default no-arg constructor
        System.out.println("Inside com.msd.oca8.Constructor03's with no args");
    }

//    public com.msd.oca8.Constructor03 (String name) {
//        super(name);
//        System.out.println("Inside com.msd.oca8.Constructor03 with argument");
//    }

    public static void main (String[] args) {
        Constructor03 const03Obj = new Constructor03();
        //com.msd.oca8.Constructor03 const03Obj1 = new com.msd.oca8.Constructor03("Default Name");
        const03Obj.printName();
    }

}

class Constructor04 {
    private String name = "com.msd.oca8.Constructor04";

    Constructor04(String name) {
    }

    Constructor04() {
        // If this constructor is not there, derived class must have a constructor that calls super matching the argument of the parent's constructor
    }

    public void printName() {
        System.out.println("Name is :: " + name);
    }
}
