package com.msd.oca8;

public class Overloading01 {

    private int overloadedMethod(int x, float y, double z) {
        return x;
    }

    private int overloadedMethod(float x, int y, double z) {
        return y;
    }

    private int overloadedMethod(double x, float y, int z) {
        return z;
    }

    private int overloadedMethod(int x, double y, float z) {
        return x;
    }

    private void overloadedMethod(int x, double y, double z) {

    }

    private void overloadedMethod(int x, int y, double z) {

    }

    private Object overloadedMethod(int x, int y, int z) {
        return null;
    }
}
