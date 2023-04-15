import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    static class Node implements Comparable<Node> {
        int index;
        int dist;

        public Node(int index, int dist) {
            this.index = index;
            this.dist = dist;
        }

        public int getIndex() {
            return index;
        }

        public int getDist() {
            return dist;
        }

        @Override
        public int compareTo(Node o) {
            return dist - o.getDist();
        }
    }

    static ArrayList<ArrayList<Node>> graph = new ArrayList<>();
    static int[] items;

    static int dijkstra(int start, int m) {
        int[] distance = new int[graph.size()];
        Arrays.fill(distance, Integer.MAX_VALUE);

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(start, 0));
        distance[start] = 0;

        while (!pq.isEmpty()) {
            Node node = pq.poll();
            int now = node.getIndex();
            int dist = node.getDist();

            if (distance[now] < dist) continue;

            for (int i = 0; i < graph.get(now).size(); i++) {
                Node temp = graph.get(now).get(i);
                int nextIndex = temp.getIndex();
                int nextDist = temp.getDist();

                if (distance[nextIndex] > distance[now] + nextDist) {
                    distance[nextIndex] = distance[now] + nextDist;
                    pq.add(new Node(nextIndex, distance[nextIndex]));
                }
            }
        }

        int sum = 0;
        for (int i = 1; i < distance.length; i++) {
            if(distance[i] <= m) {
                sum += items[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        items = new int[n + 1];
        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= n; i++) {
            items[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < r; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            graph.get(a).add(new Node(b, c));
            graph.get(b).add(new Node(a, c));
        }

        int result = 0;
        for (int i = 1; i <= n; i++) {
            result = Math.max(dijkstra(i,m),result);
        }
        System.out.println(result);
    }
}
