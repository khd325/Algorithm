import java.util.*;
import java.io.*;


public class Main {
    static int[] t = new int[15];
    static int[] p = new int[15];
    static int[] dp = new int[16];
    static int maxValue;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            t[i] = Integer.parseInt(st.nextToken());
            p[i] = Integer.parseInt(st.nextToken());
        }
        //t = [3, 5, 1, 1, 2, 4, 2]
        //p = [10,20,10,20,15,40,200]
        for(int i = n-1;i >=0;i--){
            int time = t[i] + i; // 2 + 6 = 8, 4 + 5 = 9, 2 + 4 = 6, 1 + 3 = 4, 1 + 2 = 3,
                                 // 5 + 1 = 6, 3 + 0 = 3
            if(time <= n){
                dp[i] = Math.max(p[i] + dp[time], maxValue);
                maxValue = dp[i];
            }
            else dp[i] = maxValue;
        }

        System.out.println(maxValue);

    }
}