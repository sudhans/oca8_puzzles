package com.msd.oca8;

public class Inheritance03 extends A1{

    private int i = 10;

    @Override
    public void printName() {
        System.out.println(i);
    }

    public static void main (String... args) {
        Inheritance03 obj = new Inheritance03();
        obj.printName();
    }

}

class A1{
    private int i = 20;

    public void printName() {
        System.out.println(i);
    }

    A1 () {
        printName();
    }
}
