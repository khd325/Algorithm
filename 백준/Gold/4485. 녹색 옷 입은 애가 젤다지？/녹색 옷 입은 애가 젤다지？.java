import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    static class Node implements Comparable<Node> {
        int x;
        int y;
        int distance;

        public Node(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getDistance() {
            return distance;
        }

        @Override
        public int compareTo(Node o) {
            return distance - o.getDistance();
        }
    }

    static void dijkstra(int r, int c,int d) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(r, c, d));
        result[r][c] = d;

        while (!pq.isEmpty()) {
            Node node = pq.poll();

            int x = node.getX();
            int y = node.getY();
            int distance = node.getDistance();

            if (result[x][y] < distance) continue;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < result.length && ny >= 0 && ny < result.length) {
                    int nd = map[nx][ny];
                    if (result[nx][ny] > result[x][y] + nd) {
                        result[nx][ny] = result[x][y] + nd;
                        pq.add(new Node(nx, ny, result[nx][ny]));
                    }
                }
            }
        }

    }

    static int[][] map;
    static int[][] result;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int t = 0;
        while (true) {
            int n = Integer.parseInt(br.readLine());

            if (n == 0) break;

            t++;
            map = new int[n][n];
            result = new int[n][n];

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
                Arrays.fill(result[i], Integer.MAX_VALUE);
            }

            dijkstra(0, 0,map[0][0]);

            System.out.println("Problem " + t + ": " + result[n-1][n-1]);
        }
    }
}
