import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumXOR {
    //Using tries
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] =read.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i=0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
        }
    }

}

class MaximumSolution
{
    static final int INT_SIZE = 32;

    static class TrieNode
    {
        int value;
        TrieNode[] arr =new TrieNode[2];
        public TrieNode(){
            value=0;
            arr[0] = null;
            arr[1] = null;
        }
    }
    static TrieNode root;

    static void insert(int pre_xor)
    {
        TrieNode temp = root;
        for(int i=INT_SIZE-1; i>-0; i--)
        {
            int val = (pre_xor & (1<<i)) >=1 ? 1 : 0;
            if (temp.arr[val] == null)
                temp.arr[val] = new TrieNode();

            temp = temp.arr[val];

        }

        temp.value = pre_xor;
    }
}