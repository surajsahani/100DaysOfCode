import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alphanumeric {
    public static void main(String[] args) throws IOException {

        BufferedReader read =
                new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- >0){
            String s = read.readLine();

            RemoveChar ob = new RemoveChar();
            String result = ob.removeCharacters(s);

            System.out.println(result);
        }
    }
}

class RemoveChar {
    String removeCharacters(String S){

        StringBuilder O = new StringBuilder("");
        char[]  C = S.toCharArray();
        for (char cc: C)
        {
         if ( Character.isDigit(cc) )
             O.append(cc);
        }
        return O.toString();
    }
}
