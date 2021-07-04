import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t--> 0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String intputLine2[] = br.readLine().trim().split(" ");
            for (int i=0; i<n; i++){
                arr[i] = Integer.parseInt(intputLine2[i]);
            }

            MaxSolution obj = new MaxSolution();

            System.out.println(obj.circularSubarraySum(arr, n));
        }

    }
}

class MaxSolution {

    // a: input array
    //n: size of array
    // Function to find maximum circular subarray sum.
    static int circularSubarraySum(int a[], int n){

        // Your code here
        boolean allPositive = true;
        boolean allNegative = true;
        for (int i =0; i<n; i++) {
            if (a[i] > 0) {
                allNegative = false;
            }
            if (a[i] < 0) {
                allPositive = false;
            }
        }
        if (allPositive || allNegative) {
            return kadane(a,n);
        }
        return Integer.max(kadane(a,n), reverseKadane(a,n));
    }

    static int kadane(int[] arr, int n) {
        int[] dp = new int[n];
        dp[0] = arr[0];

        int max = dp[0];
        for (int i =1; i< n; i++) {
            dp[i] = Math.max(arr[i], arr[i] + dp[i -1]);
            max = Math.max(max,dp[i]);
        }

        return max;
    }

    static int reverseKadane (int[] arr, int n) {

        int sum = 0;
        for(int i =0; i< n; i++) {
            sum += arr[i];
            arr[i] = -1 * arr[i];
        }

        int rk = kadane(arr, n);
        return sum + rk;
    }
}
