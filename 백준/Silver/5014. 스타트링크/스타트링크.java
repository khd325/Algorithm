import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {

    static int[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int F = Integer.parseInt(st.nextToken()); //F층 건물
        int S = Integer.parseInt(st.nextToken()); //지금 위치
        int G = Integer.parseInt(st.nextToken()); //목표 위치
        int U = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        visited = new int[F + 1];
        Arrays.fill(visited, -1);
        search(F, S, G, U, D);

    }

    static void search(int f, int s, int g, int u, int d) {

        Queue<Integer> q = new LinkedList<>();

        q.add(s);

        visited[s] = 0;

        while (!q.isEmpty()) {
            Integer v = q.poll();

            if (v == g) {
                System.out.println(visited[v]);
                System.exit(0);
            }

            if (v + u <= f && visited[v + u] == -1) {
                visited[v + u] = visited[v] + 1;
                q.add(v + u);
            }

            if (v - d >= 1 && visited[v - d] == -1) {
                visited[v - d] = visited[v] + 1;
                q.add(v -d);
            }
        }

        System.out.println("use the stairs");
    }
}