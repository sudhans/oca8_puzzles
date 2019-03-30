public class Switch02 {

    public static void main (String... args) {
        String[] intArr = { "10", "20", "30"};
        switch (Integer.parseInt(intArr[2])) {
            case 10:
                boolean b = false;
                System.out.println("10");
                break;
            case 20:
                b = true;  // b is visible in this case and for rest of the switch
                if (b) {
                    System.out.println("20");
                }
                break;
        }

        //System.out.println(" Value of b is :: " + b); // b is not visible outside switch
    }
}
