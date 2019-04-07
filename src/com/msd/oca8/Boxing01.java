package com.msd.oca8;

import java.util.ArrayList;
import java.util.List;

public class Boxing01 {
    public static void main(String[] args) {
        ArrayList<Double> doubleList = new ArrayList<>();
        //doubleList.add(111); // You cannot box an int into Double !!
        System.out.println(doubleList.indexOf(2.0)); // prints -1
        System.out.println(doubleList.contains("Hello"));
        String String = "String";
        Integer Integer = 28;

        List myList = new ArrayList();
        myList.add(111); // Hoo.. int will be boxed to Integer and be added to myList<Object>
    }
}
