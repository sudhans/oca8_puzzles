package com.msd.hackerrank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSet01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        Set<String> uniquePair = new HashSet<>();
        int[] output = new int[t];

        for (int i = 0; i < t; i++) {
            uniquePair.add(pair_left[i] + "-" + pair_right[i]);
            output[i] = uniquePair.size();
            System.out.println(output[i]);
            System.out.println(uniquePair);
        }

    }
}
