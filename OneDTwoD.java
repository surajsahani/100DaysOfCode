import java.util.ArrayList;
import java.util.Scanner;

public class OneDTwoD
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int[] a[], b;
            a = new int[n][n];
            b = new int[n];
            int sum =0;
            for (int i=0; i<n; i++)
            {
                for (int j=0; j<n; j++)
                {
                    int p = sc.nextInt();
                    a[i][j] = p;
                }
            }
            int Max=0;
            for(int i=0; i<n; i++)
            {
                int p=sc.nextInt();
                b[i]=p;
            }
            Complete obj = new Complete();
            ArrayList<Integer> ans;
            ans = obj.array(a,b,n);
            for(int i: ans)
                System.out.println(i + " ");
            System.out.println();
        }
    }
}
class Complete
{
    public static ArrayList<Integer> array(int a[][], int b[], int n)
    {

        // just another method
        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(0);
        ans.add(0);
        for(int i  = 0; i< n; i++) {
            ans.set(1, Math.max(ans.get(1),b[i]));
            ans.set(0, ans.get(0) + a[i][i]);
        }

        return ans;
    }
//        ArrayList<Integer> res = new ArrayList<>();
//
//        int leftDiagonal = 0;
//        for (int i=0; i<n; i++)
//        {
//            leftDiagonal +=a[i][i];
//        }
//
//        int maxElement = b[0];
//        for(int i =1; i< n; i++)
//        {
//            if (b[i] > maxElement)
//            {
//                maxElement = b[i];
//            }
//        }
//        res.add(leftDiagonal);
//        res.add(maxElement);
//
//        return res;
//    }
}