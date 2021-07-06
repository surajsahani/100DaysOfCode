import java.util.ArrayList;
import java.util.Scanner;

public class snakePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();
            int matrix[][] = new int[n][n];

            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                    matrix[i][j] = sc.nextInt();
            }

            Solutionsnake ob = new Solutionsnake();
            ArrayList<Integer> ans = ob.snakePattern(matrix);
            for (Integer val: ans)
                System.out.print(val+" ");
            System.out.println();
        }
    }
}
class Solutionsnake
{
    //Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][])
    {
        // code here
        ArrayList<Integer> a = new ArrayList<Integer>();
        int n = matrix.length;
        int i =0;
        int j =0;
        int k =0;
        while(i<n){
            if(i%2 == 0){
                j = 0;
                while(j<n){
                    a.add(matrix[i][j++]);
                    k--;
                }
            }
            else{
                j = n-1;
                while(j>= 0)
                    a.add(matrix[i][j--]);
            }
            i++;

        }
        return a;
    }
}

