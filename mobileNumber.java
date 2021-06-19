import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mobileNumber {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt((br.readLine().trim()));
        while(T-->0)
        {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            boolean ans = ob.is_valid(s);
            System.out.println(ans);
        }
    }
}

class Solution
{
    public static boolean is_valid(String s)
    {
        // code here
        Pattern p = Pattern.compile("0|91?[7-9][0-9]{9}");
        Matcher m = p.matcher(s);
        return (m.find() && m.group().equals(s));
    }
}
