import java.util.*;
import java.io.*;


public class Main {
    static int gcd(int a, int b){
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        int remain = max % min;
        if(remain == 0){
            return min;
        }
        return gcd(min,remain);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int gcd = gcd(a,b);
        System.out.println(gcd);
        System.out.println(a*b/gcd);
    }
}
