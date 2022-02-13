import java.io.*;
import java.util.*;

class Node{
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
    static int cnt = 0;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int max = Integer.MIN_VALUE;

    static void bfs(){
        Queue<Node> q = new LinkedList<>();
        int[][] clone = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                clone[i][j] = map[i][j];
                if(clone[i][j] == 2) q.offer(new Node(i,j));
            }
        }

        while(!q.isEmpty()){
            Node node = q.poll();
            int x = node.getX();
            int y = node.getY();

            for(int i = 0; i < 4;i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx <0 || ny < 0 || nx >= n || ny >= m) continue;

                if(clone[nx][ny] ==0){
                    clone[nx][ny] = 2;
                    q.offer(new Node(nx,ny));
                }
            }
        }
        int cnt = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j <m ;j++){
                if(clone[i][j] == 0){
                    cnt++;
                }
            }
        }
        max = Math.max(cnt,max);
    }

    static void check() {
        if (cnt == 3) {
            bfs();
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (cnt != 3 && map[i][j] == 0) {
                    map[i][j] = 1;
                    cnt++;
                    check();
                    map[i][j] = 0;
                    cnt--;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        check();
        System.out.println(max);

    }
}

