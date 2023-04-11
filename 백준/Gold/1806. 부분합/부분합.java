import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int left = 0;
        int right = 0;
        int sum = 0;
        int distance = Integer.MAX_VALUE;
        for (int i = left; i < n; i++) {
            while (sum < s && right < n) {
                sum += arr[right++];
            }

            if (sum >= s && distance > right - i) {
                distance = right - i;
            }
            sum -= arr[i];
        }

        System.out.println(distance == Integer.MAX_VALUE ? 0 : distance);
    }
}
