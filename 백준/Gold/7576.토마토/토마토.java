import java.util.*;
import java.io.*;

class Node {
    private int x;
    private int y;

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
}


public class Main {
    static int n, m;
    static int[][] map;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int max = 0;
    static void bfs() {
        Queue<Node> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 1) {
                    q.offer(new Node(i, j));
                }
            }
        }

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node node = q.poll();
                int x = node.getX();
                int y = node.getY();

                for(int j = 0; j < 4; j++){
                    int nx = x + dx[j];
                    int ny = y + dy[j];

                    if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                    if(map[nx][ny] == -1) continue;

                    if(map[nx][ny] == 0){
                        map[nx][ny] = map[x][y] + 1;
                        q.offer(new Node(nx,ny));
                    }
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        map = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bfs();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(map[i][j] == 0) {
                    System.out.println(-1);
                    System.exit(0);
                }
                if(max < map[i][j]) max = map[i][j];
            }
        }
        System.out.println(max-1);
    }
}
