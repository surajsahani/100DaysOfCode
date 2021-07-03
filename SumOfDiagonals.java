import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfDiagonals {
    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- >0) {
            int N = Integer.parseInt((read.readLine()));
            int Grid[][] = new int[N][N];
            for (int i=0; i< N; i++) {
                String[] s = read.readLine().split(" ");
                for  (int j =0; j < N; j++) Grid[i][j] = Integer.parseInt(s[j]);
            }
            Diagonal ob = new Diagonal();
      //      System.out.println(ob.diagonalSumDiff(N, Grid));
        }
    }
}

class Diagonal {
//    int diagonalSumDiff(int N, int[][] Grid) {
//
//    }
}
