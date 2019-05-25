package com.msd.oca11;

import java.util.ArrayList;
import java.util.List;

public class TypeInference01 {

    public static void main(String... args) {

        var values1 = List.of("Hello", "World");
        values1.forEach(System.out::print);

        var values = new ArrayList<String>();
        values.addAll(values1);

        String[] sa = (String[]) values.toArray();
        // The above line needs a cast, otherwise compilation error Object[] can be asssigned to String[]
        // LL Get Runtime exception anyway


    }
}
