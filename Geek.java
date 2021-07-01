class martial
{
    int id;
    String name;

    martial(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
}

public class Geek {
    public static void main(String[] args) {

        martial coder = new martial("geeks",1);

        System.out.println("GeekName :" + coder.name + "and GeekId :" + coder.id);
    }
}
