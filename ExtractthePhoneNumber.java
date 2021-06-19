import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
        String[] word=text.split(" ");
        int i=0,count=0;
        char[] sen=text.toCharArray();
        while(i<sen.length-1){
            if((sen[i]=='.' || sen[i]=='?' || sen[i]=='!') && sen[i+1]==' '){
                count++;
            }
            i++;
        }
        count++;
        List<Integer> result = new Stack<Integer>();
        result.add(count);
        result.add(word.length);
        return result;
    }
    }
