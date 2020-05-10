package com.msd.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// CTRL + D sends EOF
public class EndOfFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputLines = new ArrayList<>();

        do {
            String inputLine = scanner.nextLine();
            inputLines.add(inputLine);
        } while (scanner.hasNext());

        int counter = 1;
        for (String input : inputLines) {
            System.out.println(counter++ + " " + input);
        }

    }
}
