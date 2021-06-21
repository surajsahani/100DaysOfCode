import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class javaRegex
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt((br.readLine().trim()));
        while(T -->0)
        {
            int N = Integer.parseInt(br.readLine().trim());
            SolutionPrime ob = new SolutionPrime();
            int ans = ob.isPrime(N);
            System.out.println(ans);

        }
    }
}


class SolutionPrime
{
    public  int isPrime(int N)
    {
        // code here
        return !new String(new char[N]).matches(".?|(..+?)\\1+")?1:0;
    }
}
