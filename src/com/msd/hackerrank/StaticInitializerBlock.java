package com.msd.hackerrank;

import java.util.Scanner;

public class StaticInitializerBlock {

    static int B, H;
    static boolean flag;

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        if (B <= 0 || H <= 0) {
            throw new RuntimeException("Breadth and height must be positive");
        } else {
            flag = true;
        }
    }

    public static void main(String[] args) throws Exception {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main

}//end of class