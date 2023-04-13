import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static class Node implements Comparable<Node> {
        private int index;
        private int distance;

        public Node(int index, int distance) {
            this.index = index;
            this.distance = distance;
        }

        public int getIndex() {
            return index;
        }

        public int getDistance() {
            return distance;
        }

        @Override
        public int compareTo(Node o) {
            return distance - o.getDistance();
        }
    }

    static void dijkstra(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>();

        pq.add(new Node(start, 0));
        distance[start][start] = 0;

        while (!pq.isEmpty()) {
            Node node = pq.poll();

            int now = node.getIndex();
            int dist = node.getDistance();

            if (distance[start][now] < dist) continue;
            for (int i = 0; i < graph.get(now).size(); i++) {
                Node nextNode = graph.get(now).get(i);

                int nextIndex = nextNode.getIndex();
                int nextDist = nextNode.getDistance();

                if (distance[start][now] + nextDist < distance[start][nextIndex]) {
                    distance[start][nextIndex] = distance[start][now] + nextDist;
                    pq.add(new Node(nextIndex, distance[start][nextIndex]));
                }
            }
        }
    }

    static ArrayList<ArrayList<Node>> graph = new ArrayList<>();
    static int[][] distance;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        distance = new int[n + 1][n + 1];
        for (int[] ints : distance) {
            Arrays.fill(ints, Integer.MAX_VALUE);
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            graph.get(a).add(new Node(b, c));
        }

        for (int i = 1; i <= n; i++) {
            dijkstra(i);
        }

        int[] result = new int[n + 1];
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (i == x) continue;

            result[i] = distance[x][i] + distance[i][x];
            answer = Math.max(result[i], answer);
        }

        System.out.println(answer);
    }
}
