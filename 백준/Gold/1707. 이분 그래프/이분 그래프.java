import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static boolean bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        color[start] = 1;

        while (!q.isEmpty()) {
            Integer index = q.poll();

            for (int i = 0; i < graph.get(index).size(); i++) {
                if (color[index] == color[graph.get(index).get(i)]) {
                    return false;
                }

                if (color[graph.get(index).get(i)] == 0) {
                    color[graph.get(index).get(i)] = color[index] * -1;
                    q.add(graph.get(index).get(i));
                }
            }
        }

        return true;
    }

    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] visited;
    static int[] color;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            graph = new ArrayList<>();
            st = new StringTokenizer(br.readLine());

            int v = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            for (int i = 0; i <= v; i++) {
                graph.add(new ArrayList<>());
            }

            color = new int[v + 1];

            for (int i = 0; i < e; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                graph.get(a).add(b);
                graph.get(b).add(a);
            }

            boolean flag = true;

            for (int i = 1; i <= v; i++) {
                if (color[i] == 0) {
                    flag = bfs(i);
                    if (!flag) break;
                }
            }

            if (flag) sb.append("YES").append("\n");
            else sb.append("NO").append("\n");

        }
        System.out.println(sb);


    }
}
