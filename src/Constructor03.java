public class Constructor03 extends Constructor04{

    private String name = "Constructor03";
    public void printName() {
        System.out.println("Name is :: " + name);
    }

    public static void main (String[] args) {
        Constructor03 const03Obj = new Constructor03();
        //Constructor03 const03Obj1 = new Constructor03("Default Name");
        const03Obj.printName();
    }

//    public Constructor03 (String name) {
//        super(name);
//        System.out.println("Inside Constructor03 with argument");
//    }

    public Constructor03 () {
         // No need to call super(). It will be automatically added by the compiler, only when the parent has default no-arg constructor
         System.out.println("Inside Constructor03's with no args");
    }

}

class Constructor04 {
    private String name = "Constructor04";
    Constructor04(String name) {
    }

    Constructor04() {
        // If this constructor is not there, derived class must have a constructor that calls super matching the argument of the parent's constructor
    }

    public void printName() {
        System.out.println("Name is :: " + name);
    }
}
