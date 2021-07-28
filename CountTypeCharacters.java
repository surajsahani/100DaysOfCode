import java.util.Scanner;

public class CountTypeCharacters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            String s = sc.next();
      //      int[] res = new Sol().count(s);

         //   for (int i = 0; i < 4; i++)
           //     System.out.println(res[i]);
        }
    }
}

//class Sol
//{
//    int[] count (String s)
//    {
//        int[] chars = new int[4];
//
//        for (int i=0; i<s.length(); i++)
//        {
//            char c =s.charAt(i);
//
//            if (c>=65 && c<=90) chars[0]++;
//            else if (c>=97 && c<=122) chars[1]++;
//            else if (c>=48 && c<=57) chars[2]++;
//            else chars[3]++;
//        }
//        return chars;
//    }
//}