import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[] arr;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    static void dfs(int depth) {
        if (depth == n) {
            for (int i : arr) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 1; i <= n; i++){
            if(!visited[i]){
                visited[i] = true;
                arr[depth] = i;
                dfs(depth+1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        arr = new int[n];
        visited = new boolean[n+1];

        dfs(0);
        System.out.println(sb);
    }
}
