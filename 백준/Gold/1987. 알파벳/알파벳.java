import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    static char[][] board;
    static boolean[] alphabet;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int result = 0;

    static void dfs(int x, int y, int cnt) {

        result = Math.max(result, cnt);

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx >= board.length || ny >= board[0].length) continue;

            if (!alphabet[board[nx][ny] - 'A']) {
                alphabet[board[nx][ny] - 'A'] = true;
                dfs(nx, ny, cnt + 1);
                alphabet[board[nx][ny] - 'A'] = false;
            }
        }


    }

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        board = new char[r][c];
        alphabet = new boolean[26];

        for (int i = 0; i < r; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                board[i][j] = str.charAt(j);
            }
        }

        alphabet[board[0][0] - 'A'] = true;
        dfs(0, 0, 1);

        System.out.println(result);


    }
}
