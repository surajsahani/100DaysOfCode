import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class isPerfect {
    public static void main(String[] args) throws IOException {
        BufferedReader read =
                new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- >0) {
            int N = Integer.parseInt(read.readLine());
            PerfectSolution ib = new PerfectSolution();
            System.out.println(ib.isPerfect(N));
        }


    }
}

class PerfectSolution {
    int isPerfect(int N) {
        int tsum, fsum = 0;
        int t, rNum = N;
        while (N > 0) {
            t = N % 10;
            tsum = 1;
            while (t > 0) {
                tsum *= t;
                t--;
            }
            fsum += tsum;
            N = N / 10;
        }
        if (fsum == rNum) return 1;
        else return 0;
    }
}