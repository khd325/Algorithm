import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int[] result;
    static boolean[] visited;

    static void dfs(int start, int depth) {

        visited[start] = true;
        result[start] = depth;

        for (int i = 0; i < graph.get(start).size(); i++) {
            Integer now = graph.get(start).get(i);

            if (!visited[now]) {
                dfs(now, depth + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        result = new int[n + 1];
        visited = new boolean[n + 1];
        Arrays.fill(result, -1);

        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for (int i = 1; i <= n; i++) {
            ArrayList<Integer> integers = graph.get(i);
            Collections.sort(integers);
        }

        dfs(r, 0);

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= n; i++){
            sb.append(result[i]).append("\n");
        }

        System.out.println(sb);
    }
}