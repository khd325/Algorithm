import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        int[] sumArr = new int[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sumArr[i] = sumArr[i-1] + arr[i];
        }

        long sum = 0L;

        for(int i = 1; i < n; i++){
            sum += (long) arr[i] * (sumArr[n] - sumArr[i]);
        }

        System.out.println(sum);


    }
}
