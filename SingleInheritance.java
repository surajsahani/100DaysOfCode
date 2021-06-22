
class One {
    public void print_geek()
    {
        System.out.println("Geeks");
    }
}

class two extends One {
    public void print_for()
    {
        System.out.println("for");
    }
}
// Driver class
public class SingleInheritance {
    public static void main(String[] args)
    {
        two g = new two();
        g.print_geek();
        g.print_for();
        g.print_geek();
    }
}
