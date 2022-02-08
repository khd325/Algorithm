import java.util.*;
import java.io.*;

class Node {
    private int x;
    private int y;
    private int z;

    public Node(int z, int x, int y) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
}


public class Main {
    static int n, m, h;
    static int[][][] map;
    static int[] dx = {-1, 1, 0, 0, 0, 0};
    static int[] dy = {0, 0, -1, 1, 0, 0};
    static int[] dz = {0, 0, 0, 0, -1, 1};
    static int max = 0;

    static void bfs() {
        Queue<Node> q = new LinkedList<>();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (map[i][j][k] == 1) {
                        q.offer(new Node(i, j, k));
                    }
                }
            }
        }


        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node node = q.poll();
                int x = node.getX();
                int y = node.getY();
                int z = node.getZ();

                for (int j = 0; j < 6; j++) {
                    int nz = z + dz[j];
                    int nx = x + dx[j];
                    int ny = y + dy[j];

                    if (nz < 0 || nx < 0 || ny < 0 || nz >= h || nx >= n || ny >= m) continue;

                    if (map[nz][nx][ny] == -1) continue;

                    if (map[nz][nx][ny] == 0) {
                        map[nz][nx][ny] = map[z][x][y] + 1;
                        q.offer(new Node(nz, nx, ny));
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
        h = Integer.parseInt(st.nextToken());

        map = new int[h][n][m];

        for (int k = 0; k < h; k++) {
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < m; j++) {
                    map[k][i][j] = Integer.parseInt(st.nextToken());
                }
            }
        }

        bfs();
        max = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if(map[i][j][k] == 0){
                        System.out.println(-1);
                        System.exit(0);
                    }else{
                        if(max < map[i][j][k])
                            max = map[i][j][k];
                    }
                }
            }
        }

        System.out.println(max-1);
    }
}
