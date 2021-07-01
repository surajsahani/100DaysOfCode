class ConstructorP
{
    ConstructorP(String name)
    {
        System.out.println("Constructor wit one " + "argument - String : " + name);
    }

    ConstructorP(String name, int age)
    {
        System.out.println("Constructor with two arguments : " +
                " String and Integer :" + name + " " + age);
    }

    ConstructorP(long id)
    {
        System.out.println("Constructor with one argument  :" + "Long : " + id);
    }
}


public class ConstructorOverloading {

    public static void main(String[] args) {

        ConstructorP cons = new ConstructorP("Martial");

        ConstructorP cons2 = new ConstructorP("martial", 24);

        ConstructorP con3 = new ConstructorP(14545455);
    }
}
