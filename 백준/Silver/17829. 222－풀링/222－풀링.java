import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        int[][] result;
        while (n != 1) {

            int[][] temp = new int[arr.length][arr.length];

            for (int i = 0; i < temp.length; i++) {
                temp[i] = Arrays.copyOf(arr[i], arr[i].length);
            }

            arr = new int[n / 2][n / 2];

            for (int i = 0; i < n; i += 2) {
                for (int j = 0; j < n; j += 2) {
                    int a = temp[i][j];
                    int b = temp[i + 1][j];
                    int c = temp[i][j + 1];
                    int d = temp[i + 1][j+1];

                    int[] t = {a, b, c, d};
                    Arrays.sort(t);

                    arr[i/2][j/2] = t[2];
                }
            }

            n /= 2;
        }
        System.out.println(arr[0][0]);
    }
}

