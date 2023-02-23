import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    private static void bfs(ArrayList<ArrayList<Integer>> list, int start) {
        boolean[] visited = new boolean[list.size()];
        int[] result = new int[list.size()];

        int cnt = 1;
        result[start] = cnt++;
        visited[start] = true;

        Queue<Integer> q = new LinkedList<>();
        q.add(start);

        while (!q.isEmpty()) {
            int node = q.poll();

            for(int i = 0; i < list.get(node).size(); i++) {
                int v = list.get(node).get(i);
                if(!visited[v]) {
                    visited[v] = true;
                    result[v] = cnt++;
                    q.add(v);
                }
            }
        }

        for(int i = 1; i < list.size(); i++){
            System.out.println(result[i]);
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list.get(a).add(b);
            list.get(b).add(a);
        }

        for (int i = 1; i < list.size(); i++) {
            Collections.sort(list.get(i));
        }

        bfs(list, R);

    }
}
