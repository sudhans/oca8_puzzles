package com.msd.hackerrank;

import java.util.*;

public class Map01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        Map<String, String> phoneBook = new HashMap<>(n);
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            phoneBook.put(name, String.valueOf(phone));
        }
        List<String> queries = new ArrayList<>();
        while (in.hasNext()) {
            String s = in.nextLine();
            queries.add(s);
        }
        queries.forEach((query) ->
        {
            if (phoneBook.containsKey(query)) {
                System.out.println(query + "=" + phoneBook.get(query));
            } else {
                System.out.println("Not found");
            }

        });
    }
}
