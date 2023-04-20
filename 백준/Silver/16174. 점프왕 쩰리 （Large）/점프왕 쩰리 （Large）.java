import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        int[][] map = new int[n][n];
        boolean[][] visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{0, 0});
        visited[0][0] = true;


        boolean flag = false;
        while (!q.isEmpty()) {
            int[] pos = q.poll();
            int x = pos[0];
            int y = pos[1];

            if(map[x][y] == -1) {
                flag = true;
                break;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i] * map[x][y];
                int ny = y + dy[i] * map[x][y];

                if (nx < 0 || ny < 0 || nx >= n || ny >= n) continue;

                if (!visited[nx][ny]) {
                    visited[nx][ny] = true;
                    q.add(new int[]{nx, ny});
                }
            }
        }

        if(flag) System.out.println("HaruHaru");
        else System.out.println("Hing");


    }
}
