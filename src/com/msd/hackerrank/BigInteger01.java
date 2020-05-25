package com.msd.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class BigInteger01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);
        System.out.println(A.add(B));
        System.out.println(A.multiply(B));
        in.close();
    }
}
