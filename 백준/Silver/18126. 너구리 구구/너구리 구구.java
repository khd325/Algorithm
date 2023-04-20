import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static class Node {
        int x;
        long distance;

        public Node(int x, long distance) {
            this.x = x;
            this.distance = distance;
        }

        public int getX() {
            return x;
        }

        public long getDistance() {
            return distance;
        }
    }

    static ArrayList<ArrayList<Node>> graph = new ArrayList<>();
    static boolean[] visited;

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine());
        visited = new boolean[n + 1];

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < n - 1; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            graph.get(a).add(new Node(b, c));
            graph.get(b).add(new Node(a, c));
        }

        Queue<Node> q = new LinkedList<>();

        q.add(new Node(1, 0));
        visited[1] = true;

        long result = 0;

        while (!q.isEmpty()) {

            Node node = q.poll();
            int x = node.getX();
            long distance = node.getDistance();
            result = Math.max(distance, result);
            for (int i = 0; i < graph.get(x).size(); i++) {
                Node nextNode = graph.get(x).get(i);
                if (!visited[nextNode.getX()]) {
                    q.add(new Node(nextNode.getX(), distance + nextNode.getDistance()));
                    visited[nextNode.getX()] = true;
                }
            }
        }

        System.out.println(result);

    }
}
