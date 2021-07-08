import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args)
    {
        TreeSet<String> t = new TreeSet<String>();
        t.add("Java");

        t.add("Spring");
        t.add("Hibernate");
        t.add("Hibernate");
        System.out.println(t);

    }
}
