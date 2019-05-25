package com.msd.oca8;

public class Switch04 {
    public static void main(String[] args) {
        char i;
        for (i = 0; i < 5; i++) {
            switch (i++) {
                case '0':
                    System.out.println("A");
                    break;
                case 1:
                    System.out.println("B");
                    break;
                case 2:
                    System.out.println("C");
                    break;
                case 3:
                    System.out.println("D");
                    break;
                case 4:
                    System.out.println("E");

                case 'E':
                    System.out.println("F");
                    break;
            }
        }
    }
}

// Prints C, E, F
