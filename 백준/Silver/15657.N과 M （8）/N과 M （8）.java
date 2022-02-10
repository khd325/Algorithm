import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static int[] arr;
    static int[] sequence;
    //static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    static void dfs(int start, int depth) {
        if (depth == m) {
            for (int i : sequence) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i < n; i++) {
            sequence[depth] = arr[i];
            dfs(i, depth + 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        sequence = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        //visited = new boolean[n];
        Arrays.sort(arr);
        dfs(0, 0);
        System.out.println(sb);
    }
}
