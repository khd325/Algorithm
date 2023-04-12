import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main {

    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int cnt = 0;

    static void dfs(int node, int parent, int depth) {
        if (graph.get(node).size() == 1 && graph.get(node).get(0) == parent) {
            cnt += depth;
            return;
        }

        for (int i = 0; i < graph.get(node).size(); i++) {
            if (graph.get(node).get(i) == parent) {
                continue;
            }

            dfs(graph.get(node).get(i), node, depth + 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < n -1; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        dfs(1,0,0);
        System.out.println(cnt % 2 == 0 ? "No" : "Yes");
    }
}