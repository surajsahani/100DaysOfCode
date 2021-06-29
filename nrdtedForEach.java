import java.util.LinkedList;
import java.util.List;

public class nrdtedForEach {
    public static void main(String[] args)
    {

        List<Integer> l = new LinkedList<Integer>();

        l.add(2);
        l.add(3);
        l.add(4);

        List<Integer> s = new LinkedList<Integer>();
        s.add(2);
        s.add(4);
        s.add(5);
        s.add(6);

        for (int a:l)
        {
            for (int b:s)
            {
                if (a<b)
                    System.out.println(a + " ");
            }
        }
    }
}
