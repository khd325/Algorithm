import java.io.*;
import java.util.*;

class Node {
    private int x;
    private int y;
    private int dist;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDist() {
        return dist;
    }

    public Node(int x, int y, int dist) {
        this.x = x;
        this.y = y;
        this.dist = dist;
    }
}

public class Main {

    static int bfs(int x, int y) {
        Queue<Node> q = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];

        visited[x][y] = true;
        q.add(new Node(x, y, 0));
        int d = 0;
        while (!q.isEmpty()) {
            Node node = q.poll();
            int curX = node.getX();
            int curY = node.getY();
            int curD = node.getDist();

            for (int i = 0; i < 4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if (map[nx][ny] == 'L' && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        q.add(new Node(nx, ny, curD + 1));
                        d = Math.max(curD + 1, d);
                    }
                }
            }
        }

        return d;

    }

    static int n;
    static int m;
    static char[][] map;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new char[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = str.charAt(j);
            }
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 'L') {
                    result = Math.max(result,bfs(i, j));
                }
            }
        }
        System.out.println(result);

    }

}
