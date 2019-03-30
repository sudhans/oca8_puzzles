public class Switch01 {
    public static void main (String[] args) {
        int i=99;
        long j = i;

        switch (i) {
            case 99:
            case 100:
                System.out.println("Hundred");
                break;
            case 101:
                // continue; // Continue is not allowed inside switch
            default:
                break;
        }

//        switch (j) {   // Incompatible types - long, float, double can't be used for Switch
//            case 99:
//            case 100:
//                System.out.println("Hundred");
//                break;
//            default:
//                break;
//        }
    }
}
