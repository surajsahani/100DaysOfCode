import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfArrays {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int) (n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i= 0; i< n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            SumOfArraySolution obj = new SumOfArraySolution();
            System.out.println(obj.getSum(a,n));

        }
    }
}

class SumOfArraySolution{
    public long getSum(long a[], long n)
    {
        long sum = 0;
        for (int i = 0; i< n ; i++)
            sum = sum + a[i];
        return sum;
    }
}