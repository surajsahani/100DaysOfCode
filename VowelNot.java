import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class VowelNot {

    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0)
        {
            char c = ( char )read.read();

            VowelOrNot ob = new VowelOrNot();
            System.out.println(ob.isVowel(c));
        }
    }
}

class VowelOrNot{
    static String isVowel(char c){
        if (c=='a' || c=='i' || c=='e' || c=='o' || c == 'u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
        {
            return("YES");
        }
        else
        {
            return ("NO");
        }
    }
}