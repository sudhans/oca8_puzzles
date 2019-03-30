import packageone.Inheritance01;

public class Inheritance02 extends Inheritance01 {

    public static void main (String... args) {

        Inheritance02 derivedObject = new Inheritance02();
        System.out.println(derivedObject.publicMethod() + " from derived object");
        System.out.println(derivedObject.protectedMethod() + " from derived object");

        derivedObject.callParentPublicMethod();
        derivedObject.callParentProtectedMethod();

        Inheritance01 parentObject = new Inheritance02();
        System.out.println(parentObject.publicMethod() + " from parent object");
        //System.out.println(parentObject.protectedMethod() + " from parent object"); // Compilation Error

        Inheritance01 pureParentObject = new Inheritance01();
        System.out.println(pureParentObject.publicMethod() + " from pure parent object");
        //System.out.println(pureParentObject.protectedMethod() + " from pure parent object"); // Compilation Error

        //parentObject.callParentPublicMethod(); // Compilation Error
        //parentObject.callParentProtectedMethod(); // Compilation Error

    }

    private void callParentPublicMethod() {
        System.out.println(publicMethod() + " via inheritance");
    }

    private void callParentProtectedMethod() {
        System.out.println(protectedMethod() + " via inheritance");
    }
}
