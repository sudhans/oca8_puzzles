package com.msd.hackerrank;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(" ");
        while (scanner.hasNextInt()) {
            System.out.println(scanner.nextInt());
        }
    }
}
