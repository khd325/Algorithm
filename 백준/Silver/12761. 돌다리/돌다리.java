import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        boolean[] visited = new boolean[100001];

        Queue<Integer> q = new LinkedList<>();

        q.add(n);
        visited[n] = true;
        int cnt = 0;
        loop:
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Integer now = q.poll();
                if (now == m) break loop;
                if (now - 1 >= 0 && now - 1 < 100001 && !visited[now - 1]) {
                    visited[now - 1] = true;
                    q.add(now - 1);
                }

                if (now + 1 >= 0 && now + 1 < 100001 && !visited[now + 1]) {
                    visited[now + 1] = true;
                    q.add(now + 1);
                }

                if (now - a >= 0 && now - a < 100001 && !visited[now - a]) {
                    visited[now - a] = true;
                    q.add(now - a);
                }
                if (now + a >= 0 && now + a < 100001 && !visited[now + a]) {
                    visited[now + a] = true;
                    q.add(now + a);
                }
                if (now - b >= 0 && now - b < 100001 && !visited[now - b]) {
                    visited[now - b] = true;
                    q.add(now - b);
                }
                if (now + b >= 0 && now + b< 100001 && !visited[now + b]) {
                    visited[now + b] = true;
                    q.add(now + b);
                }

                if (now * a >= 0 && now * a < 100001 && !visited[now * a]) {
                    visited[now * a] = true;
                    q.add(now * a);
                }
                if (now * b >= 0 && now * b < 100001 && !visited[now * b]) {
                    visited[now * b] = true;
                    q.add(now * b);
                }
            }
            cnt++;
        }

        System.out.println(cnt);

    }
}
