import java.util.*;
import java.io.*;


public class Main {
    static class Node {
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

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][n];



        st = new StringTokenizer(br.readLine());

        int r1 = Integer.parseInt(st.nextToken());
        int c1 = Integer.parseInt(st.nextToken());
        int r2 = Integer.parseInt(st.nextToken());
        int c2 = Integer.parseInt(st.nextToken());
        map[r1][c1] = 0;

        int[] dx = {-2, -2, 0, 0, 2, 2};
        int[] dy = {-1, 1, -2, 2, -1, 1};

        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(r1, c1));


        while (!q.isEmpty()) {
            Node node = q.poll();
            int x = node.getX();
            int y = node.getY();

            for (int i = 0; i < 6; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx < 0 || ny < 0 || nx >= n || ny >= n) continue;
                if(map[nx][ny] != 0) continue;

                else{
                    map[nx][ny] = map[x][y] + 1;
                    q.offer(new Node(nx,ny));
                }
            }
        }

        if(map[r2][c2] == 0) System.out.println(-1);
        else System.out.println(map[r2][c2]);
    }

}