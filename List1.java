import java.util.*;

public class List1 {
    public static void main(String[] args) {
        List<String> l1 = new Stack<>();

        l1.add("martial");
        l1.add("coder");
        l1.add(1, "for");

        System.out.println("Initial ArrayList" + l1);

        l1.remove(1);

        System.out.println("After the Index Removal" + l1);

        l1.remove("martial");

        System.out.println("After the Object Removal" + l1);
    }
}
