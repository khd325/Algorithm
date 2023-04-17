import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static void dfs(int r, int c, int count, int eat) {

        if (result) return;
        
        if (count <= 3 && eat >= 2) {
            result = true;
            return;
        }

        if(count >= 3 && eat < 2) {
            return;
        }

        visited[r][c] = true;

        for (int i = 0; i < 4; i++) {
            int nx = r + dx[i];
            int ny = c + dy[i];

            if ((nx >= 0 && ny >= 0 && nx < 5 && ny < 5) && map[nx][ny] != -1) {
                if (!visited[nx][ny] && map[nx][ny] == 1) {
                    dfs(nx, ny, count + 1, eat + 1);
                } else if (!visited[nx][ny] && map[nx][ny] == 0) {
                    dfs(nx, ny, count + 1, eat);
                }
            }
        }

        visited[r][c] = false;
    }

    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static boolean result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        map = new int[5][5];
        visited = new boolean[5][5];

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine());

        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        dfs(r, c, 0, 0);

        System.out.println(result ? 1 : 0);
    }
}
