import java.util.*;
import java.io.*;

class Node {
    private int x;
    private int y;
    private int count;
    private int wall;

    public Node(int x, int y, int count, int wall) {
        this.x = x;
        this.y = y;
        this.count = count;
        this.wall = wall;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getCount() {
        return count;
    }

    public int getWall() {
        return wall;
    }
}


public class Main {
    static int l;
    static int[][] map;
    static boolean[][][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int n, m;

    static int bfs(int x, int y) {
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x,y,1,0));
        visited[x][y][0] = true; //부시지않고 방문
        visited[x][y][1] = true; // 부수면서 방문

        while(!q.isEmpty()){
            Node node = q.poll();

            if(node.getX() == n -1 && node.getY() == m -1) return node.getCount();

            for(int i = 0; i <4; i++){
                int nx = node.getX() + dx[i];
                int ny = node.getY() + dy[i];

                if(nx <0 || ny < 0 || nx >= n || ny >= m) continue;

                if(map[nx][ny] == 0){
                    if(!visited[nx][ny][node.getWall()]){
                        q.offer(new Node(nx,ny,node.getCount()+1,node.getWall()));
                        visited[nx][ny][node.getWall()] = true;
                    }
                }else if(map[nx][ny] == 1){
                    if(node.getWall() == 0 && (!visited[nx][ny][1])){
                        q.offer(new Node(nx,ny,node.getCount()+1,1));
                        visited[nx][ny][1] = true;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        visited = new boolean[n][m][2];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }
        System.out.println(bfs(0,0));

    }
}
