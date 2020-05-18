package com.msd.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList01 {
    public static void main(String[] args) {
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scanner.nextLine();
        List<List<Integer>> lines = new ArrayList<>(5);
        for (int i = 0; i < n; i++) {
            String numberInputLine = scanner.nextLine();
            String[] numbersArray = numberInputLine.split(" ");
            int d = Integer.parseInt(numbersArray[0]);
            List<Integer> numbers = new ArrayList<>(d);
            for (int j = 1; j <= d; j++) {
                numbers.add(Integer.parseInt(numbersArray[j]));
            }
            lines.add(numbers);
        }

        int q = scanner.nextInt();
        scanner.nextLine();
        List<QueryPosition> queryPositions = new ArrayList<>(q);
        for (int i = 0; i < q; i++) {
            QueryPosition queryPosition = new QueryPosition();
            String queryInput = scanner.nextLine();
            String[] queryParams = queryInput.split(" ");
            queryPosition.x = Integer.parseInt(queryParams[0]);
            queryPosition.y = Integer.parseInt(queryParams[1]);
            queryPositions.add(queryPosition);
        }
        scanner.close();
//
//        System.out.println("*****************************************");
//        System.out.println("# of lines " + n);
//        for (int i=0;i<lines.size();i++) {
//            List<Integer> line = lines.get(i);
//            for (int j=0; j< line.size(); j++) {
//                System.out.print(line.get(j) + " ");
//            }
//            System.out.println();
//        }
//
//        System.out.println("Query q = " + q);
//        for (QueryPosition queryPosition: queryPositions) {
//            System.out.println("Query Positions: " + queryPosition);
//        }
//
//        System.out.println("*****************************************");

        for (QueryPosition position : queryPositions) {
            int lineNumber = position.x - 1;
            int yPosition = position.y - 1;
            if (lineNumber >= 0 && lineNumber < lines.size()) {
                List<Integer> line = lines.get(lineNumber);
                if (yPosition >= 0 && yPosition < line.size()) {
                    System.out.println(line.get(yPosition));
                } else {
                    System.out.println("ERROR!");
                }

            } else {
                System.out.println("ERROR!");
            }
        }
    }

    private static class QueryPosition {
        int x, y;

        @Override
        public String toString() {
            return "QueryPosition{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
}
