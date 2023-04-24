import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        int[][] arr = new int[10][10];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int x = 0;
        int y = 0;
        int max = -1;
        for (int i = 1; i < 10; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < 10; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (max < arr[i][j]) {
                    x = i;
                    y = j;
                    max = arr[i][j];
                }
            }
        }

        System.out.println(max);
        System.out.println(x + " " + y);

    }
}
