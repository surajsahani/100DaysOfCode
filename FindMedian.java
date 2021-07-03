import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindMedian {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine();
            String[] S = s.split(" ");
            int[] v = new int[n];
            for (int i = 0; i < n; i++) {
                v[i] = Integer.parseInt(S[i]);
                SolutionMedian ob = new SolutionMedian();
                int ans = ob.find_median(v);
                System.out.println(ans);
            }
        }
    }

    static class SolutionMedian {

        public int find_median(int[] v) {
            int size = v.length;
            Arrays.sort(v);
            if (size % 2 == 0)
                return v[size / 2] + v[(size / 2) - 1] / 2;
            return v[size / 2];
        }
    }
}

