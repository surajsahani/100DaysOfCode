abstract class Party {
    static void doParty()
    {
        System.out.println("Lets have some fun!!");
    }
}

public class Main extends Party {
    public static void main(String[] args)
    {
        Party.doParty();
    }
}
