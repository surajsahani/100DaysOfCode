import java.io.IOException;
import java.util.Scanner;

public class PatternMatching {
    public static void main(String[] args)throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int N = sc.nextInt();
            PatternMatchingSolution ob = new PatternMatchingSolution();
            ob.printPattern(N);
            System.out.println();
        }
    }
}

class PatternMatchingSolution {
    static void printPattern(int n)
    {
        int i,j;
        for ( i=0; i<n; i++)
        {
            System.out.println(" ");
        }
        for ( j=0; j<=i; j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
}
