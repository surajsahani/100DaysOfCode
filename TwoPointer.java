import java.io.*;
import java.util.*;

public class TwoPointer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < t; i++)
                a[i] = Integer.parseInt(str[i]);
            String[] xy = br.readLine().trim().split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);
            SolutionTwoPointer g = new SolutionTwoPointer();
            System.out.println(g.minDist(a, n, x, y));
        }
    }
}

class SolutionTwoPointer {
    int minDist(int a[], int n, int x, int y) {
        // code here
        int recent_x = -1;
        int recent_y = -1;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i< n; i++){
            if (a[i] ==x) {
                recent_x = i;

                if (recent_y != -1)
                    ans = Math.min(Math.abs(recent_x - recent_y), ans);
            } else if (a[i] == y) {
                recent_y = i;

                if (recent_x != -1)
                    ans = Math.min(Math.abs(recent_x - recent_y), ans);
            }
        }

        if (ans == Integer.MAX_VALUE) return -1;
        return ans;
//        List<Integer> l1 = new ArrayList<>();
//        List<Integer> l2 = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            if (a[i] == x)
//                l1.add(i);
//            else if (a[i] == y)
//                l2.add(i);
//        }
//        if (l1.size() == 0 || l2.size() == 0)
//            return -1;
//
//        int min = Integer.MAX_VALUE;
//        for (int i : l1) {
//            for (int j : l2) {
//                min = Math.min(Math.abs(i - j), min);
//            }
//        }
//
//        return min;
    }
}