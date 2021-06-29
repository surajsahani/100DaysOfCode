import java.util.ArrayList;

public class ArrayListExampleAdding {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Geeks");
        al.add("Geeks");
        al.add("Geeks");

        System.out.println("Initial ArrayList " + al);

        al.remove(1);

        System.out.println("After the Index Removal" + al);

        al.remove("Geeks");

        System.out.println("After the Object Removal " + al);
    }
}
