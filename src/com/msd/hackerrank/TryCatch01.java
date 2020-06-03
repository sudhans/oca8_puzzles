package com.msd.hackerrank;

import java.util.Scanner;

public class TryCatch01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputX = scanner.next();
        String inputY = scanner.next();
        scanner.close();
        try {
            int x = Integer.parseInt(inputX);
            int y = Integer.parseInt(inputY);
            if (y == 0) {
                System.out.println("java.lang.ArithmeticException: / by zero");
            } else {
                System.out.println(x / y);
            }

        } catch (NumberFormatException nfe) {
            System.out.println("java.util.InputMismatchException");
        }

    }

}
