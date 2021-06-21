import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class PrintBracketNumber {

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- >0) {
            String S = read.readLine();
            SolutionBracket ob = new SolutionBracket();
            ArrayList<Integer> result = ob.bracketNumbers(S);
            for (int value : result)
                System.out.println(value + " ");
            System.out.println();
        }
    }
}
class SolutionBracket {
    ArrayList<Integer> bracketNumbers(String S) {

        ArrayList<Integer> a1 = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int count =   1;
        for(int i=0; i<S.length(); i++) {
            if(S.charAt(i)=='(') {
                stack.push(count);
                a1.add(count);
                count++;
            } if (S.charAt(i)==')'){
                a1.add(stack.pop());
            }
        }
        return a1;
    }
};
