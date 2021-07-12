import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CubeRoot {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t--> 0){
            int N = Integer.parseInt(br.readLine());

            CubeRootSolution ob = new CubeRootSolution();
            System.out.println(ob.cubeRoot(N));
        }

    }
}
class CubeRootSolution{
    static int cubeRoot(int N){
        return (int)(Math.cbrt(N));
    }
}