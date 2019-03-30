package com.msd.oca8;

import java.util.ArrayList;
import java.util.List;

public class ForEach01 {


    public static void main(String... args) {
        String str = null;
        List<String> listStr = new ArrayList<>();
        for (final String str1 : listStr) {  // final modifier is allowed here
            System.out.println("Hello" + str);
        }

//        for (str : listStr) {  // Compilation Error - Can't reuse existing variables
//            System.out.println("Hello" + str);
//        }
    }
}
