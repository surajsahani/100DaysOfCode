import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class RotateArray
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //taking testcases
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++)
        {
            String str=br.readLine();
            String[] starr=str.split(" ");

            //input n and d
            int n=Integer.parseInt(starr[0]);
            int d= Integer.parseInt(starr[1]);

            int[] arr=new int[n];
            String str1=br.readLine();
            String[] starr1=str1.split(" ");

            //inserting elements in the array
            for(int j=0;j<n;j++)
            {
                arr[j]= Integer.parseInt(starr1[j]);
            }

            //calling rotateArr() function
            new SolutionRotate().rotateArr(arr, d, n);
            StringBuffer sb=new StringBuffer();

            //printing the elements of the array
            for(int t1=0;t1<n;t1++)
                sb.append(arr[t1]+" ");
            System.out.println(sb);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class SolutionRotate
{
    //Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        int temp[]= new int[d];
        for(int i =0; i<d; i++) {
            temp[i]=arr[i];
        }
        int j=0;
        for(int i=d; i<n ; i++) {
            arr[j]=arr[i];
            j++;
        }
        for(int i=0; i<d; i++) {
            arr[n-d+i]= temp[i];
        }

        // Reverse approach

    }
}