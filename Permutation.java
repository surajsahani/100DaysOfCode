import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Permutation {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t--> 0){
            String a[] = in.readLine().trim().split("\\s+");
            Long n = Long.parseLong(a[0]);
            Long r = Long.parseLong(a[1]);

            PermutationSolution ob = new PermutationSolution();
            System.out.println(ob.nPr(n,r));

        }
    }
}
class PermutationSolution {
    static long nPr(long n, long r){
        return factorial(n)/factorial(n-r);
    }
    static long factorial(long n){
        if(n == 0) return 1;
        return (n* factorial(n-1));
    }
}

