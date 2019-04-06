package com.msd.hackerrank;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Int");
        int i = scanner.nextInt();
        System.out.println("Enter Double");
        double d = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter String");
        String s = scanner.nextLine();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        scanner.close();
    }
}
