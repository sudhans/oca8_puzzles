package com.msd.oca8;

public class Static01 {

    private static String getStaticString(String x) {
        System.out.println(x);
        return x;
    }

    static String s1 = getStaticString("a");
    String s2 = getStaticString("1");

    static {
        String s3 = getStaticString("b");
    }

    {
        String s4 = getStaticString("2");
    }

    static String s5 = getStaticString("c");
    String s6 = getStaticString("3");

    public static void main(String... args) {
        Static01 static01 = new Static01(); // Prints a b c 1 2 3 --> static blocks first, followed by non-static, in the order
    }
}
