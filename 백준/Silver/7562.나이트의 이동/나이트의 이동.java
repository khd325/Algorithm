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
    static int l;
    static int[][] map;
    static int[] dx = {-1, -2, -2, -1, 1, 2, 2, 1};
    static int[] dy = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int start_x;
    static int start_y;
    static int end_x;
    static int end_y;


    static void bfs(int start_x, int start_y) {
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(start_x, start_y));
        map[start_x][start_y] = 1;

        while (!q.isEmpty()) {
            Node node = q.poll();
            int x = node.getX();
            int y = node.getY();
            for(int i = 0; i < 8; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx < 0 || ny < 0 || nx >= l || ny >= l) continue;
                if(map[nx][ny] == 0){
                    map[nx][ny] = map[x][y] + 1;
                    q.offer(new Node(nx,ny));
                }

                else{
                    if(map[x][y] + 1 < map[nx][ny]){
                        map[nx][ny] = map[x][y]+1;
                    }
                }

            }
        }


    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            l = Integer.parseInt(br.readLine());
            map = new int[l][l];
            StringTokenizer st = new StringTokenizer(br.readLine());
            start_x = Integer.parseInt(st.nextToken());
            start_y = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            end_x = Integer.parseInt(st.nextToken());
            end_y = Integer.parseInt(st.nextToken());

            bfs(start_x, start_y);
            System.out.println(map[end_x][end_y]-1);
        }


    }
}
