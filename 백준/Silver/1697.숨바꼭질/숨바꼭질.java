import java.util.*;
import java.io.*;

public class Main {
    static int[] visited = new int[100001];
    static int n;
    static int k;

    static int bfs(int start) {
        if (n == k) {
            return 0;
        }

        Queue<Integer> q = new LinkedList<>();
        q.offer(start);

        while (!q.isEmpty()) {
            int v = q.poll();
            if(visited[k] != 0){
                break;
            }

            if ((v - 1 >= 0) && visited[v - 1] == 0) {
                visited[v - 1] = visited[v] + 1;
                q.offer(v - 1);
            }

            if ((v < visited.length-1) && visited[v + 1] == 0) {
                visited[v + 1] = visited[v] + 1;
                q.offer(v+1);
            }

            if((v*2 < visited.length) && visited[v*2] == 0){
                visited[v * 2] = visited[v]+1;
                q.offer(v*2);
            }


        }
        return visited[k];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        System.out.println(bfs(n));


    }
}
