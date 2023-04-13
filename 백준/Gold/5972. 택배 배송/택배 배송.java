import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    static class Cow implements Comparable<Cow> {
        int no;
        int cost;

        public Cow(int no, int cost) {
            this.no = no;
            this.cost = cost;
        }

        public int getNo() {
            return no;
        }

        public int getCost() {
            return cost;
        }

        @Override
        public int compareTo(Cow o) {
            return cost - o.getCost();
        }
    }

    static ArrayList<ArrayList<Cow>> graph = new ArrayList<>();
    static int[] distance;

    static void dijkstra(int start) {
        PriorityQueue<Cow> pq = new PriorityQueue<>();

        pq.add(new Cow(start, 0));
        distance[start] = 0;

        while (!pq.isEmpty()) {
            Cow now = pq.poll();
            int no = now.getNo();
            int cost = now.getCost();

            if (distance[no] < cost) continue;

            for (int i = 0; i < graph.get(no).size(); i++) {
                Cow nextCow = graph.get(no).get(i);

                int nextCost = nextCow.getCost();
                int nextNo = nextCow.getNo();

                if (distance[nextNo] > distance[no] + nextCost) {
                    distance[nextNo] = distance[no] + nextCost;
                    pq.add(new Cow(nextNo, distance[nextNo]));
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        distance = new int[n + 1];
        Arrays.fill(distance, Integer.MAX_VALUE);

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            graph.get(a).add(new Cow(b, c));
            graph.get(b).add(new Cow(a, c));
        }

        dijkstra(1);

        System.out.println(distance[n]);
    }
}
