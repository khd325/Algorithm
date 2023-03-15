import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    static int R;
    static int C;
    static int sheep = 0;
    static int wolf = 0;
    static char[][] map;
    static boolean[][] visited;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static void bfs(int x, int y) {
        Queue<Node> q = new LinkedList<>();
        int s = 0;
        int w = 0;
        q.add(new Node(x, y));
        visited[x][y] = true;
        while (!q.isEmpty()) {
            Node n = q.poll();
            if(map[n.getX()][n.getY()] == 'v') {
                w++;
            } else if (map[n.getX()][n.getY()] == 'o'){
                s++;
            }

            for(int i = 0; i < 4; i++) {
                int nx = n.getX() + dx[i];
                int ny = n.getY() + dy[i];

                if(nx >= 0 && nx < R && ny >= 0 && ny < C) {
                    if (map[nx][ny] != '#' && !visited[nx][ny]) {
                        q.add(new Node(nx,ny));
                        visited[nx][ny] = true;
                    }
                }
            }
        }
        if(s > w) {
            wolf -= w;
        }else {
            sheep -= s;
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        map = new char[R][C];
        visited = new boolean[R][C];

        for (int i = 0; i < R; i++) {
            map[i] = br.readLine().toCharArray();
            for (int j = 0; j < C; j++) {
                if (map[i][j] == 'v') wolf++;
                else if (map[i][j] == 'o') sheep++;
            }
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (map[i][j] == 'v' && !visited[i][j]) {
                    bfs(i, j);
                }
            }
        }

        System.out.println(sheep + " " + wolf);
    }
}