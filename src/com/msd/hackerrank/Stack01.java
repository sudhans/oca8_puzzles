package com.msd.hackerrank;

import java.util.*;

public class Stack01 {

    private static final Map<String, String> pair = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<String> inputStack = new ArrayDeque<>();
        pair.put("{", "}");
        pair.put("[", "]");
        pair.put("(", ")");

//        while (sc.hasNext()) {
//            String input=sc.next();
//            //Complete the code
//            inputStack.push(input);
//        }
//        inputStack.push("({}[])");
//        inputStack.push("(({()})))");
//        inputStack.push("({(){}()})()({(){}()})(){()}");
//        inputStack.push("{}()))(()()({}}{}");
//        inputStack.push("}}}}");
//        inputStack.push("))))");
//        inputStack.push("{{{");
//        inputStack.push("(((");
//        inputStack.push("[]{}(){()}((())){{{}}}{()()}{{}{}}");
//        inputStack.push("[[]][][]");
//        inputStack.push("}{");

//       inputStack.push("{}{");
//        inputStack.push("({)}");
//        inputStack.push("[[");

//        inputStack.push("({()})");
        // inputStack.push("[({})(())]");
        inputStack.push("({(){}()})()({(){}()})(){()}{}((()))");

        inputStack.descendingIterator().forEachRemaining(str -> System.out.println(isBalancedString(str)));
    }


    static boolean isBalancedString(String str) {
        if (str.trim().isEmpty()) {
            return true;
        } else if (str.trim().length() % 2 != 0) {
            return false;
        }
        String firstChar = String.valueOf(str.charAt(0));
        String matchingPair = pair.get(firstChar);
        if (matchingPair == null) {
            return false;
        } else if (!str.contains(matchingPair)) {
            return false;
        }

        int count = 1;
        String innerString = "";
        for (int i = 1; i < str.length(); i++) {
            String nextChar = String.valueOf(str.charAt(i));
            if (nextChar.equals(matchingPair)) {
                count--;
            }
            if (nextChar.equals(firstChar)) {
                count++;
            }

            if (count == 0) {
                innerString = str.substring(1, i);
                boolean result = isBalancedString(innerString);
                if (!result) {
                    return false;
                } else {
                    String outerString = str.substring(i + 1);
                    return isBalancedString(outerString);
                }
            }
        }
        return true;
    }

}
