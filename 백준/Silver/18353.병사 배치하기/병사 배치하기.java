import java.util.*;
import java.io.*;


public class Main {
    static ArrayList<Integer> list = new ArrayList<>();

    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        dp = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            list.add(Integer.parseInt(st.nextToken()));
        }

        for(int i = 0; i < n; i++){
            dp[i] = 1;
        }
        for(int i = 1; i < n; i++){
            for(int j = 0; j < i; j++){
                if(list.get(i) < list.get(j)){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
        }

        Arrays.sort(dp);

        System.out.println(n - dp[n-1]);


    }
}