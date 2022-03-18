import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    static int n;
    static int[][] map;
    static boolean[] visited;
    static int result = Integer.MAX_VALUE;

    static void dfs(int start, int depth) {
        if (depth == n / 2) {
            cal();
            return;
        }

        for (int i = start; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(i + 1, depth + 1);
                visited[i] = false;
            }
        }
    }

    static void cal() {
        int team_a = 0;
        int team_b = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                if (visited[i] == true && visited[j] == true) {
                    team_a += map[i][j];
                    team_a += map[j][i];
                } else if (visited[i] == false && visited[j] == false) {
                    team_b += map[i][j];
                    team_b += map[j][i];
                }
            }
        }

        result = Math.min(result,Math.abs(team_a - team_b));
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        n = Integer.parseInt(br.readLine());

        map = new int[n][n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 0);
        System.out.println(result);
    }
}