import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static void rotate(int[] arr, int a, int b, int c) {
        int[] temp = new int[b - a + 1];

        System.arraycopy(arr, c, temp, 0, b - c + 1);
        System.arraycopy(arr, a, temp, b-c+1, c - a);

        System.arraycopy(temp, 0, arr, a, b - a + 1);

    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            int c = Integer.parseInt(st.nextToken()) - 1;

            rotate(arr, a, b, c);
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < arr.length; i++){
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }
}
