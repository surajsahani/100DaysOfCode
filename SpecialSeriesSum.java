import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.BufferOverflowException;

public class SpecialSeriesSum {
    public static void main(String[] args) throws IOException {
        BufferedReader read =
                new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- >0){
            long n = Integer.parseInt(read.readLine());

            SSS ob = new SSS();

            System.out.println(ob.SumOfTheSeries(n));
        }

    }
}
class SSS {
    static long SumOfTheSeries(long n){
        return n*(n+1)*(n+2)/6;
    }
}