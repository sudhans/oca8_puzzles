package com.msd.hackerrank;

import java.util.Scanner;

public class Loops2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] arrayA = new int[t];
        int[] arrayB = new int[t];
        int[] arrayN = new int[t];
        for (int i = 0; i < t; i++) {
            arrayA[i] = in.nextInt();
            arrayB[i] = in.nextInt();
            arrayN[i] = in.nextInt();
        }
        in.close();

        for (int i = 0; i < t; i++) {
            printOutput(calculateSeries(arrayA[i], arrayB[i], arrayN[i]));
        }
    }

    private static int[] calculateSeries(int a, int b, int n) {
        int element = a;
        int[] elementArray = new int[n];
        for (int i = 0; i < n; i++) {
            element += Math.pow(2, i) * b;
            elementArray[i] = element;
        }
        return elementArray;
    }

    private static void printOutput(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i]);
            if (i < elements.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
