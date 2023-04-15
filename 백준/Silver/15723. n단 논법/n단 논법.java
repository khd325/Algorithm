import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    static boolean dfs(int a, int b) {

        if (a == b) {
            return true;
        }

        visited[a] = true;

        for (int i = 0; i < graph.get(a).size(); i++) {
            if (!visited[graph.get(a).get(i)]) {
                return dfs(graph.get(a).get(i), b);
            }
        }

        return false;
    }

    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < 26; i++) {
            graph.add(new ArrayList<>());
        }


        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            String[] strs = str.split(" ");

            char a = strs[0].charAt(0);
            char b = strs[2].charAt(0);

            graph.get(a - 'a').add(b - 'a');
        }

        int m = Integer.parseInt(br.readLine());

        for (int i = 0; i < m; i++) {
            visited = new boolean[26];
            String str = br.readLine();
            String[] strs = str.split(" ");

            char a = strs[0].charAt(0);
            char b = strs[2].charAt(0);

            if (dfs(a - 'a', b - 'a')) {
                sb.append("T").append("\n");
            } else {
                sb.append("F").append("\n");
            }
        }
        System.out.println(sb);

    }
}
