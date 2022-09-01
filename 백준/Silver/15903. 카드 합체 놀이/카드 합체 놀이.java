import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        long[] arr = new long[n];

        for(int i = 0; i < n; i++){
            arr[i] = Long.parseLong(st.nextToken());
        }

        for(int i = 0; i < m; i++){
            Arrays.sort(arr);

            long temp = arr[0] + arr[1];
            arr[0] = temp;
            arr[1] = temp;
        }

        long result = Arrays.stream(arr).sum();
        System.out.println(result);


    }
}
