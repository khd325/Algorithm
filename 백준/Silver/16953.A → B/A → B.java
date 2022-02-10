import java.util.*;
import java.io.*;


public class Main {
    static long a, b;
    static long result = -1;
    static void dfs(long num,int cnt){
        if(num > b){
            return;
        }
        if(num == b){
            result = cnt;
            return;
        }
        dfs(num*2,cnt+1);
        dfs(num*10+1,cnt+1);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Long.parseLong(st.nextToken());
        b = Long.parseLong(st.nextToken());


        dfs(a,1);


        System.out.println(result);

    }
}
