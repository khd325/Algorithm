import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int from = Integer.parseInt(st.nextToken());
        int to = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

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

        int result = 0;

        Queue<Integer> q = new LinkedList<>();
        q.add(from);
        boolean[] visited = new boolean[n + 1];
        visited[from] = true;
        boolean flag = false;

        loop:
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int now = q.poll();
                if (now == to) {
                    flag = true;
                    break loop;
                }
                for (int j = 0; j < graph.get(now).size(); j++) {
                    int x = graph.get(now).get(j);

                    if (!visited[x]) {
                        visited[x] = true;
                        q.add(x);
                    }
                }
            }
            result++;
        }

        System.out.println(flag ? result: -1);


    }

}
