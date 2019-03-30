class Constructor02 {

    private String name = "Constructor02";

    public void printName() {
        System.out.println("Name from 02 is :: " + name);
    }

    Constructor02() {
        System.out.println("Default - Constructor 02 ");
        printName();
    }

}

public class Constructor01 extends Constructor02 {

    private String name = "Constructor01";

    public void printName() {
        System.out.println("Name from 01 is :: " + name);
    }

    private Constructor01() {
        System.out.println("Default - Constructor 01 ");
    }

    public static void main(String[] args) {
        Constructor01 constructor01 = new Constructor01();  // Prints Default - Constructor 02, Name from 01 is :: null, Default - Constructor 01
        Constructor02 constructor02 = new Constructor02();    // Prints Default - Constructor 02, Name from 02 is :: Constructor02

    }
}
