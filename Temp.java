class TempT
{
    TempT()
    {
        this(5);
        System.out.println("The Default constructor");
    }

    TempT(int x)
    {
        this(5,15);
        System.out.println(x);
    }

    TempT(int x, int y)
    {
        System.out.println(x * y);
    }

    public static void main(String[] args) {
        new TempT();
    }
}

