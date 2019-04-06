package com.msd.hackerrank;

import java.util.Scanner;

public class Format01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            System.out.println("\n");
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d", s1, x);
        }
        System.out.println("\n================================");

    }
}
