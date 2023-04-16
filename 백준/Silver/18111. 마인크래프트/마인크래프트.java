import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int sec = Integer.MAX_VALUE;
        int floor = 0;

        for (int f = 0; f < 257; f++) {
            int useBlock = 0;
            int getBlock = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (map[i][j] > f) {
                        getBlock += map[i][j] - f;
                    } else if (map[i][j] < f) {
                        useBlock += f - map[i][j];
                    }
                }
            }

            if (getBlock + b < useBlock) continue;

            int temp = getBlock * 2 + useBlock;
            if(temp <= sec) {
                sec = temp;
                floor = f;
            }

        }

        System.out.println(sec + " " + floor);
    }
}