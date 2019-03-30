import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Lambda01 {

    public static void main (String... args) {

        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println(checklist(arrayList, List::isEmpty)); // prints true
        System.out.println(checklist(arrayList, a1 -> a1.isEmpty())); // prints true
        System.out.println(checklist(arrayList, a1 -> a1.add("abcd"))); // prints true;

        //System.out.println(checklist(arrayList, (ArrayList<String> a1) -> a1.isEmpty())); // Compilation Error - Incompatible parameter types in lambda
    }

    private static boolean checklist(List<String> list, Predicate<List<String>> predicate) {
        return predicate.test(list);
    }
}
