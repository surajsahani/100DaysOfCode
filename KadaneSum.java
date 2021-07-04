import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class KadaneSum {

    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");

            //adding elements
            for (int i =0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            KadabeSolution obj = new KadabeSolution();
            System.out.println(obj.maxSubarraySum(arr, n));
        }
    }

}

class KadabeSolution {

    int maxSubarraySum(int arr[], int n) {

        int before = arr[0];
        int after = arr[0];

        for (int i =1; i<n; i++)
        {
            before = Math.max(arr[i], after+arr[i]);
            after = Math.max(before, after);
        }

        return before;
    }
}