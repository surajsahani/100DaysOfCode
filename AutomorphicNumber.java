import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AutomorphicNumber {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            AutomorphismSolution ob = new AutomorphismSolution();
            String ans = ob.is_AutomorphicNumber(n);
            System.out.println(ans);
        }
    }
}
class AutomorphismSolution
{
    public String is_AutomorphicNumber(int n)
    {
        String s = "Not Automorphic";
        int num = n*n;
        while (n>0)
        {
            if (n%10!=num%10)
                return s;
            n=n/10;
            num=num/10;
        }
        s="Automorphic";
        return s;
    }
}
