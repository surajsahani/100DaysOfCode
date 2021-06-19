import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompareTwoFractions {
    public static void main(String[] args) throws IOException {
        {
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

            Fraction ob = new Fraction();
            int t = Integer.parseInt(read.readLine());
            while(t-- >0)
            {
                String s = read.readLine().trim();
                String ans = ob.compareFrac(s);
                System.out.println(ans);
            }
        }
    }
}

class Fraction {
    String compareFrac(String s) {
        String s1 = s.substring(0,s.indexOf("/"));
        String s2 = s.substring(s.indexOf("/") + 1, s.indexOf(","));
        String s3 = s.substring(s.indexOf(" ") + 1, s.lastIndexOf("/"));
        String s4 = s.substring(s.lastIndexOf("/") + 1);
        float f1 = Float.parseFloat(s1) / Float.parseFloat(s2);
        float f2 = Float.parseFloat(s3) / Float.parseFloat(s4);
        if (f1 > f2 ) return s1 + "/" + s2;
        else if (f1 == f2) return "equal";
        else return s3 + "/" + s4;
    }
}