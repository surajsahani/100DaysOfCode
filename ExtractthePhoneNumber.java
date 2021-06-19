import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ExtractthePhoneNumber
{

    public static void main(String[] args)throws IOException
    {
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(read.readLine());
            while(t-- > 0)
            {
                String S = read.readLine();

                Solution ob = new Solution();
                System.out.println(ob.phoneNumber(S));
            }
        }
    }

    class Solution {
      static String phoneNumber(String S)
      {

      }
    }
