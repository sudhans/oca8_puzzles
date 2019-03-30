public class Operator02 {

    public static void main(String... args) {
        int i = 100;
        int j = -100;
        System.out.println("Right Shift Operator positive i :: " + (i >> 2)); // Divide by 4, ==> prints 25
        System.out.println("Right Shift Operator negative j :: " + (j >> 2)); // Divide by 4, ==> prints -25

        System.out.println("Unsigned Right Shift Operator positive i :: " + (i >>> 2)); // Divide by 4, only when i is positive ==> prints 25
        System.out.println("Unsigned Right Shift Operator negative j :: " + (j >>> 2)); // Not easy :) - 1073741799
        System.out.println("Left Shift Operator:: " + (i << 2)); // Multiply by 4 ==> prints 400
        //System.out.println("Unsigned Left Shift Operator:: " + (i <<< 2)); // No such operator <<< - Compilation fails
    }
}
