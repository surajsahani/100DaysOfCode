import java.io.*;
import java.util.ArrayList;
import java.util.List;


class ExtractthePhoneNumber {
    public static void main(String[] args)throws IOException
    {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

            int t = Integer.parseInt(in.readLine());
            while(t-- > 0) {
                String text = in.readLine();

                SolutionA ob = new SolutionA();
                List<Integer> ans = new ArrayList<Integer>();

                ans = ob.sentenceWord(text);
                System.out.println(ans.get(0)+" "+ans.get(1));
            }
        }
    }
class SolutionA{
    static List<Integer> sentenceWord(String text){
        // code here

        List<Integer> ans = new ArrayList<>();
        String arr1[] = text.split("[!?.:]+");
        String arr[] = text.split("\\s");

        ans.add(arr1.length);
        ans.add(arr.length);
        return ans;
    }
    }
