import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    static int result;
    static Set<String> set;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static void dfs(int x, int y, int[][] board, String nums) {
        if (nums.length() == 6) {
            set.add(nums);
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx >= 5 || ny >= 5) {
                continue;
            }

            dfs(nx, ny, board,nums + board[nx][ny]);
        }

    }


    public static void main(String[] args) throws IOException {
        result = 0;
        set = new HashSet<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] board = new int[5][5];

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                dfs(i, j, board, String.valueOf(board[i][j]));
            }
        }
        System.out.println(set.size());
    }
}
