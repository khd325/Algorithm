import java.io.*;
import java.util.*;

public class Main {
    static class Node {
        private int x;
        private int y;
        private int num;
        public Node(int x, int y, int num) {
            this.x = x;
            this.y = y;
            this.num = num;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getNum(){
            return num;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] map = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        Queue<Node> q = new LinkedList<>();

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for (int u = 1; u <= k; u++) {
            for (int v = 0; v < n; v++) {
                for (int w = 0; w < n; w++) {
                    if (map[v][w] == u) {
                        q.offer(new Node(v, w,u));
                    }
                }
            }
        }

        while(s > 0){
            int size = q.size();
            for(int i = 0; i < size; i++){
                Node node = q.poll();

                int u = node.getX();
                int v = node.getY();
                int num = node.getNum();

                for(int j = 0; j < 4; j++){
                    int nx = u + dx[j];
                    int ny = v + dy[j];

                    if(nx < 0 || ny < 0 || nx >=n || ny >= n) continue;

                    if(map[nx][ny] == 0) {
                        map[nx][ny] = num;
                        q.offer(new Node(nx,ny,num));
                    }
                }
            }
            s--;
        }

        System.out.println(map[x-1][y-1]);
    }
}

