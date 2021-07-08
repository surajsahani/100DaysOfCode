import java.util.ArrayList;
import java.util.Scanner;

public class UpperLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int t = sc.nextInt();

        while(t--> 0)
        {
            int n = sc.nextInt();

            int matrix[][] = new int[n][n];
            for (int i =0; i<n; i++)
                for (int j=0; j < n; i++)
                    matrix[i][j] = sc.nextInt();

                UpperSolution ob = new UpperSolution();
   //             ArrayList<Integer> ans = ob.sumTraingles(matrix,n);
    //            for (Integer val: ans)
     //               System.out.println(val+" ");
            System.out.println();
        }
    }
}
class UpperSolution{
//    static ArrayList<Integer> sumTraingles(int matrix[][], int n)
//    {
//
//    }
 //   return ;
}