public class StaticBlock01 {
    static {
        int x = 0;
        int y = 10;
        //int z = y/x; // throws java.lang.ExceptionInInitializerError at runtime
        // throw new NullPointerException(); // implicit throw statements are not allowed - compilation error
        if (x == 0) {
            throw new NullPointerException(); // throws java.lang.ExceptionInInitializerError at runtime
        }
    }

    public static void main(String[] args) {
        StaticBlock01 obj = new StaticBlock01();
        System.out.println("Hello");
    }
}
