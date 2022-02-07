import java.util.*;
import java.io.*;

public class Main {
    static int[] arr;
    static int[] lotto = new int[6];
    static int k;
    static StringBuilder sb = new StringBuilder();

    static void dfs(int start,int depth){
        if(depth == 6){
            for (int i : lotto) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = start; i < k;i++){
            lotto[depth] = arr[i];
            dfs(i+1,depth+1);
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while(true){
            st = new StringTokenizer(br.readLine());
            k = Integer.parseInt(st.nextToken());
            if(k ==0 ) break;
            arr = new int[k];

            for(int i = 0; i < k; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            dfs(0,0);
            sb.append("\n");
        }

        System.out.println(sb);
    }
}