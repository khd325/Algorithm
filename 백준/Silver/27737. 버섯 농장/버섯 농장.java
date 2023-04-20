import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static void dfs(int x, int y) {
        cnt++;
        map[x][y] = 1;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if ((nx >= 0 && ny >= 0 && nx < map.length && ny < map.length) && map[nx][ny] == 0) {
                dfs(nx, ny);
            }
        }
    }

    static int[][] map;
    static int cnt;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        map = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int num = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 0) {
                    cnt = 0;
                    dfs(i, j);
                    num += Math.ceil(cnt / (double) k);
                }
            }
        }

        if(num == 0) {
            sb.append("IMPOSSIBLE");
        } else {
            if (num <= m) {
                sb.append("POSSIBLE").append("\n").append(m - num);
            }else {
                sb.append("IMPOSSIBLE");
            }
        }

        System.out.println(sb);
    }
}
