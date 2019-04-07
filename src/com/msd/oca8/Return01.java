package com.msd.oca8;

public class Return01 {

    public static void main(String args[]) {
        int amount = 100, seed = 6;
        switch (new Return01().luckyNumber(6)) {
            case 3:
                amount = amount * 2;
            case 7:
                amount = amount * 2;
            case 6:
                amount = amount + amount;
            default:
        }
        System.out.println(amount);
    }

    int luckyNumber(int seed) {
        if (seed > 10) return seed % 10;
        int x = 0;
        try {
//                if(seed%2 == 0) throw new Exception("No Even no.");
//                else return x;
            return 6;
        } catch (Exception e) {
            return 3;
        } finally {
            return 7;
        }
    }


}
