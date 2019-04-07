package com.msd.oca8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Array01 {
    public static void main(String[] args) {
        Object[] obj = new Object[]{"aaa", new Object(), new ArrayList(), 10};
        //Object[] obj1 = new Object[]{"aaa", new Object(), new ArrayList(), {}}; // Illegal Initializer
        Object[] obj2 = new Object[]{"aaa", new Object(), new ArrayList(), new String[]{}};
        //Object[] obj3 = new Object[1]{new Object()};

        int[][] intArrayofArrays = {{1, 2}, null}; // Valid syntax
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                // System.out.println(intArrayofArrays[i][j]); // Nullpointer exception at runtime
            }
        }

        int x = (x = 3) * 4;  // valid int declaration
        System.out.println(x);

        LocalDateTime greatDay = LocalDateTime.parse("2015-01-01");//2
        String greatDayStr = greatDay.format(DateTimeFormatter.ISO_DATE_TIME); //3
        System.out.println(greatDayStr);
    }
}
