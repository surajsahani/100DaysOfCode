import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountDigits {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
      //  int t = Integer.parseInt(read.readLine());
   //     while(t--> 0)
     //   {
            int N = Integer.parseInt(read.readLine());
            CountDigitsSolution ob = new CountDigitsSolution();
            System.out.println(ob.evenlyDivides(N));
     //   }
    }
}

class CountDigitsSolution {
    static int evenlyDivides(int N)
    {
        int temp = N, count =0;
        while(temp!=0)
        {
            int d = temp% 10;
            temp /=10;
            if(d>0 && N%d == 0)
                count++;
        }
        return count;
    }
}
