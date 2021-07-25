import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VowelOrNt {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t =Integer.parseInt(read.readLine());
        while(t--> 0)
        {
            char c = (char) read.read();
            VoweloRNotSolution ob = new VoweloRNotSolution();
            System.out.println(ob.isVowel(c));
        }
    }
}
class VoweloRNotSolution {
    static String isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return ("YES");
        } else {
            return ("NO");
        }

//        if (c == 'a' || c == 'A'
//                || c == 'e' || c == 'E'
//                || c == 'i' || c == 'I'
//                || c == 'o' || c == 'O'
//                || c == 'u' || c == 'U')
//
//            System.out.println("Yes");
//         else {
//            return "NO";
//        }
    }
}


