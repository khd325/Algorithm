import java.io.*;
import java.util.*;

class Node {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {

    static int w;
    static int h;
    static int[][] map;
    static int[] dx = {-1, -1, -1, 0, 1, 1, 1, 0};
    static int[] dy = {-1, 0, 1, 1, 1, 0, -1, -1};

    static void bfs(int a, int b) {
        Queue<Node> q = new LinkedList<>();

        q.add(new Node(a, b));
        map[a][b] = 0;

        while (!q.isEmpty()) {
            Node node = q.poll();
            int x = node.getX();
            int y = node.getY();

            for(int i = 0; i < 8; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (0 <= nx && 0 <= ny && nx < h && ny < w){
                    if(map[nx][ny] == 1){
                        map[nx][ny] = 0;
                        q.add(new Node(nx,ny));
                    }
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while(true){
            st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            if (h == 0 && w ==0){
                break;
            }
            map = new int[h][w];

            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int cnt = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (map[i][j] == 1) {
                        bfs(i, j);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }

    }

}
