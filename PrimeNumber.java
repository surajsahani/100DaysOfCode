import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.sqrt;

public class PrimeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            SolutionPrimeSqrt ob = new SolutionPrimeSqrt();
            System.out.println(ob.isPrime(N));
        }
    }
}

class SolutionPrimeSqrt{
    static int isPrime(int N){
        if(N == 1)
        {
            return 0;
        }
        for(int i = 2; i <=sqrt(N); i++)
        {
            if (N% i == 0)
            {
                return 0;
            }
        }
        return 1;
    }
}