package com.msd.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String numberInputLine = scanner.nextLine();
        String[] numberStrArray = numberInputLine.split(" ");
        List<Integer> inputList = new ArrayList<>();
        for (String str : numberStrArray) {
            inputList.add(Integer.parseInt(str));
        }

        int q = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < q; i++) {
            String query = scanner.nextLine();
            if (query.equals("Insert")) {
                String insertQuery = scanner.nextLine();
                String[] queryParams = insertQuery.split(" ");
                int insertIndex = Integer.parseInt(queryParams[0]);
                int insertValue = Integer.parseInt(queryParams[1]);
                inputList.add(insertIndex, insertValue);
            } else if (query.equals("Delete")) {
                int deleteIndex = Integer.parseInt(scanner.nextLine());
                inputList.remove(deleteIndex);
            }
        }

        for (int i = 0; i < inputList.size(); i++) {
            System.out.print(inputList.get(i));
            if (i < inputList.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}
