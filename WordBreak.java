import java.util.ArrayList;
import java.util.Scanner;

public class WordBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0)
        {
            int n;
            n = sc.nextInt();
            ArrayList<String> arr = new ArrayList<String>();
            for (int i = 0; i<n; i++)
            {
                String p =sc.nextInt();
                arr.add(p);
            }
            String line = sc.next();
            Solution line = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.wordBreak(line,arr));
        }
    }
}

class SolutionBreak  {
    public static int wordBreak(String A, ArrayList<String> B)
    {

    }
}