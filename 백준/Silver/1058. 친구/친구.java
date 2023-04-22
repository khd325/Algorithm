import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) throws IOException {

        final int MAX_VALUE = (int) 1e9;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] graph = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            Arrays.fill(graph[i], MAX_VALUE);
            String str = br.readLine();
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    graph[i][j] = 0;
                    continue;
                }
                if (str.charAt(j - 1) == 'Y') graph[i][j] = 1;
            }
        }

        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    graph[i][j] = Math.min(graph[i][k] + graph[k][j], graph[i][j]);
                }
            }
        }

        int result = 0;

        for (int i = 1; i <= n; i++) {
            int temp = 0;
            for (int j = 1; j <= n; j++) {
                if(i == j) continue;

                if(graph[i][j] <= 2) temp++;
            }

            result = Math.max(result,temp);
        }

        System.out.println(result);
    }
}
