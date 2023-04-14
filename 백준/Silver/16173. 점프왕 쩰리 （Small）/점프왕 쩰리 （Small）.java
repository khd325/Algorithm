import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static boolean flag;

    static void dfs(int x, int y, int n) {

        if (flag) return;

        if (x == n - 1 && y == n - 1) {
            flag = true;
            return;
        }

        if (x < 0 || y < 0 || x >= n || y >= n) return;


        if (!visited[x][y]) {
            visited[x][y] = true;

            for (int i = 0; i < 4; i++) {
                dfs(x + map[x][y] * dx[i], y + map[x][y] * dy[i], n);
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0,0,n);
        System.out.println(flag ? "HaruHaru" : "Hing");
    }
}
