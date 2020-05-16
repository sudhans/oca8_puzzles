package com.msd.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class HourGlas6x6 {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0},
        };
        int maxSum = Integer.MIN_VALUE;

        // Populate 3x3 matrices
        List<int[][]> hourGlassMatrices = splitTo3x3Matrix(arr);
        for (int i = 0; i < hourGlassMatrices.size(); i++) {
            int matrixSum = sumMatrix(hourGlassMatrices.get(i));
            if (matrixSum > maxSum) {
                maxSum = matrixSum;
            }
        }

        System.out.println(maxSum);

    }

    private static List<int[][]> splitTo3x3Matrix(int[][] inputArray) {
        List<int[][]> matrixList = new ArrayList<>();
        for (int i = 1; i < 5; i++) {

            for (int j = 1; j < 5; j++) {
                int[][] matrix3x3 = {
                        {inputArray[i - 1][j - 1], inputArray[i - 1][j], inputArray[i - 1][j + 1]},
                        {0, inputArray[i][j], 0},
                        {inputArray[i + 1][j - 1], inputArray[i + 1][j], inputArray[i + 1][j + 1]},
                };
                matrixList.add(matrix3x3);
            }

        }
        return matrixList;
    }

    private static void printMatrix(int[][] inputArray) {
        System.out.println("**************************************************");
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                System.out.print(" " + inputArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("**************************************************");
    }

    private static int sumMatrix(int[][] inputArray) {
        int sum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                sum += inputArray[i][j];
            }
        }
        return sum;
    }
}
