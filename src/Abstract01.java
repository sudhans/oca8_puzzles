public abstract class Abstract01 {

    abstract void abstractMethod();

    public static void main (String... args) {
       System.out.println("Running main from an Abstract Class");
       Abstract01 abstract01 = null;
       abstract01.printName(); // throws runtime exception, but compiles fine and main method can be invoked:)
    }

    private void printName() {
        System.out.println("Hello there..");
    }

}
