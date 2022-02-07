import java.io.*;
import java.util.*;


public class Main {
    static int n;
    static int m;

    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    static void dfs(int depth) {
        if (depth == m) {
            for (int j = 0; j < arr.length; j++) {
                sb.append(arr[j]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int j = 1; j <= n; j++) {
            arr[depth] = j;
            dfs(depth + 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];

        dfs( 0);
        System.out.println(sb);
    }
}
