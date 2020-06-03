package com.msd.hackerrank;

import java.util.Scanner;

interface AdvancedArithmetic {
    int divisor_sum(int n);
}

class MyCalculator01 implements AdvancedArithmetic {
    @Override
    public int divisor_sum(int n) {
        int sum = 1;
        int absN = Math.abs(n);
        for (int i = 2; i <= absN; i++) {
            if (absN % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

public class Interface01 {
    public static void main(String[] args) {
        MyCalculator01 my_calculator = new MyCalculator01();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        sc.close();
    }

    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o) {
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++) {
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}
