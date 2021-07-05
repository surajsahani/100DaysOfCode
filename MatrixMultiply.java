import java.util.Scanner;

public class MatrixMultiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            int[][] b = new int[n][n];
            int[][] c = new int[n][n];
            for (int i=0; i < n; i++)
                for (int j=0; j<n; j++)
                     a[i][j]=sc.nextInt();
                MatrixSolution g = new MatrixSolution();
                g.multiply(a,b,c,n);
                for (int i = 0; i<n; i++){
                    for (int j = 0; j < n; j++)
                        System.out.println(c[i][j]+" ");
                }
            System.out.println();
        }
    }
}

class MatrixSolution
{
    public static void multiply(int A[][], int B[][], int C[][], int N)
    {
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                for (int x = 0; x < N; x++)
                    C[i][j]+=A[i][x]*B[x][j];
            }
        }
    }
}
