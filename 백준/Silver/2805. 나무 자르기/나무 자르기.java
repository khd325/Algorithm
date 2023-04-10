import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static long search(int[] arr, int n) {

        long start = 1;
        long end = Arrays.stream(arr).max().getAsInt();
        long result = 0;
        while (start <= end) {
            long mid = (start + end) / 2;

            long temp = 0;

            for (int i = 0; i < arr.length; i++) {
                if(arr[i] > mid) {
                    temp += arr[i] - mid;
                }
            }

            if(temp >= n) {
                start = mid + 1;
                result = mid;
            }else {
                end = mid - 1;
            }
        }

        return result;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];


        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(search(arr, m));

    }
}
