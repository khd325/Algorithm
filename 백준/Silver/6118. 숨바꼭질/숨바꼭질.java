import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    static ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    static int[] dist;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        dist = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            arr.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr.get(a).add(b);
            arr.get(b).add(a);
        }
        Arrays.fill(dist, -1);
        dist[1] = 0;
        for (int i = 1; i < arr.size(); i++) {
            Collections.sort(arr.get(i));
        }

        Queue<Integer> q = new LinkedList<>();

        q.offer(1);

        while (!q.isEmpty()) {
            int v = q.poll();

            for (int i = 0; i < arr.get(v).size(); i++) {
                int x = arr.get(v).get(i);
                if (dist[x] == -1) {
                    dist[x] = dist[v] + 1;
                    q.offer(x);
                }
            }
        }

        int maxDist = Arrays.stream(dist).max().getAsInt();
        int result = 0;
        int cnt = 0;
        for (int i = 0; i < dist.length; i++) {
            if (maxDist == dist[i]) {
                cnt++;
                if (result == 0) {
                    result = i;
                }
            }
        }

        System.out.printf("%d %d %d", result, maxDist, cnt);
    }
}