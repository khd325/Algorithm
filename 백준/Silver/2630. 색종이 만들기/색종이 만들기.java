import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int white;
    static int blue;

    static void dfs(int[][] papers, int x, int y, int size) {
        if (size == 1) {
            if (papers[x][y] == 0) {
                white++;
            } else {
                blue++;
            }
            return;
        }

        int value = papers[x][y];
        boolean flag = true;
        loop:
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (value != papers[i][j]) {
                    flag = false;
                    break loop;
                }
            }
        }

        if (flag) {
            if (papers[x][y] == 0) {
                white++;
            } else {
                blue++;
            }
        } else {
            int half = size / 2;
            dfs(papers, x, y, half);
            dfs(papers, x, y + half, half);
            dfs(papers, x + half, y, half);
            dfs(papers, x + half, y + half, half);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        white = 0;
        blue = 0;

        int n = Integer.parseInt(br.readLine());

        int[][] papers = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                papers[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dfs(papers, 0, 0, n);

        System.out.println(white);
        System.out.println(blue);
    }
}
