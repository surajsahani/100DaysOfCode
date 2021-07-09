import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InaccessibleObjectException;

public class isPalindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader read =
                new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0){
            long n =Integer.parseInt(read.readLine());
            Palindrome ob = new Palindrome();

            System.out.println(ob.isSumPalindrome(n));
        }
    }
}

class Palindrome {
    static long isSumPalindrome(long n){
        for (int i=0; i<=5; i++){
            if (isPalindrome(n))
                return n;
            else
                n+=getReversedNumber(n);
        }
        return -1;
    }
    static boolean isPalindrome(long n){
        return(getReversedNumber (n)==n);
    }

    static long getReversedNumber(long n){
        long reversedNumber =0;
        while(n >0) {
            reversedNumber = (reversedNumber*10)+(n%10);
            n/=10;
        }
        return reversedNumber;
    }
}