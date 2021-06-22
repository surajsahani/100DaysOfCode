interface one {
    public void print_geek();
}
interface twoT {
    public void print_for();
}
interface threeT extends one, twoT {
    public void print_geek();
}
class child implements threeT {
    @Override public  void  print_geek()
    {
        System.out.println("Geeks");
    }
    public void print_for() {
        System.out.println("for");
    }
}

public class MultipleInheritances {
    public static void main(String[] args)
    {
      child c = new child();
      c.print_geek();
      c.print_for();
      c.print_geek();
    }
}
