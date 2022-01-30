import java.util.*;
import java.io.*;


public class Main {
    static int factorial(int a){
        if(a<=1){
            return 1;
        }
        else{
            return factorial(a-1) * a;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        System.out.println((factorial(n)) / ((factorial(n-k))*(factorial(k))));
    }
}