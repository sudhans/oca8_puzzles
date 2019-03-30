import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PassByReference01 {

    public static void main (String... args) {
        Stack s1 = new Stack();
        Stack s2 = new Stack();
        processStacks(s1, s2);
        System.out.println(s1 + " " + s2); // Prints [100] []

        List l1 = new ArrayList();
        List l2 = new ArrayList();
        processLists(l1, l2);
        System.out.println(l1 + " " + l2); // Prints [200] []

    }

    private static void processStacks(Stack x1, Stack x2) {
        x1.push(new Integer("100"));
        x2 = x1;
    }

    private static void processLists(List x1, List x2) {
        x1.add(new Integer("200"));
        x2 = x1;
    }
}
