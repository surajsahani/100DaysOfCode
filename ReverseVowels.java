import java.io.IOException;
import java.util.Scanner;

public class ReverseVowels {
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0)
        {
            String s;
            s = sc.next();

            ReversVowels ob = new ReversVowels();
            System.out.println(ob.modify(s));
        }

    }
}
class ReversVowels
{
    String modify (String s)
    {
        int i = 0, j = s.length() -1;
        char[] str = s.toCharArray();

        while (i < j){
            if (!isVowel(str[i])){
                i++;
                continue;

            }
            if (!isVowel(str[j])){
                j--;
                continue;
            }

            char t = str[i];
            str[i] = str[j];
            str[j] = t;

            i++;
            j--;
        }

        return String.copyValueOf(str);
    }

    boolean isVowel(char c) {
        return (c=='a' || c== 'A' || c == 'e' || c =='E' || c =='i' || c=='I' || c== 'o' || c=='O' || c == 'u'
        || c == 'U');
    }
}