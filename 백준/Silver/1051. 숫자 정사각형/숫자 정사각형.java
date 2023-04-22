import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int[][] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }


        int maxLength = Math.min(n, m);

        int result = 1;
        loop:
        for (int k = maxLength; k >= 1; k--) {
            for (int i = 0; i < n - k; i++) {
                for (int j = 0; j < m - k; j++) {
                    if (arr[i][j] == arr[i + k][j] &&
                            arr[i][j] == arr[i][j + k] &&
                            arr[i][j] == arr[i+k][j+k]) {
                        result = (k + 1) * (k + 1);
                        break loop;
                    }

                }
            }
        }

        System.out.println(result);


    }
}
