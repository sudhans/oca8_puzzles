package com.msd.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class SubArrays01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] inputArray = new int[n];
        for (int i = 0; i < n; i++) {
            inputArray[i] = scanner.nextInt();
        }
        scanner.close();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                int[] subArray = Arrays.copyOfRange(inputArray, j, i);
                int sum = sumArray(subArray);
                if (sum < 0)
                    count++;
            }
        }
        System.out.println(count);

    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
