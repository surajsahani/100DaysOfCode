import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Pair{
    int x;
    int y;

    public Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class custom_Compare{

    static void sortPairs(Pair arr[], int N){

        Arrays.sort(arr, Comparator.comparing(p -> p.x));

        //printing the x,y Pairs
        for(int i=0; i<N; i++){
            System.out.println(arr[i].x + " " + arr[i].y + " ");
        }
        System.out.println();
    }
}
public class PathinJava {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int testcase = sc.nextInt();

        while(testcase--> 0) {

            int N = sc.nextInt();

            Pair arr[] = new Pair[N];

            for(int i = 0; i<N;  i++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                arr[i] = new Pair(x,y);
            }

            custom_Compare obj = new custom_Compare();

            obj.sortPairs(arr, N);
        }
    }
}
