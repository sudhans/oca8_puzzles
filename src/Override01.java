public class Override01 {

    public void printName() {
        System.out.println("Non-static Print Name Method");
    }

//    public static void printName() {
//        System.out.println("Static print name method");
//    }
    // Overriding a non-static method with static method (or vice-versa) will result in compilation errors in case of classes.
}

interface i1 {
    default void printName() {
        System.out.println("Default name method from Interface 1");
    }

    static void printAge() {
        System.out.println("Static age method from Interface 1");
    }
}

interface i2 extends i1 {
//     static void printName() {  // This method is not accepted
//        System.out.println("Static name method from Interface 2");
//    }

    default void printAge() { // This is OK
        System.out.println("Default age method from Interface 2");
    }
}
