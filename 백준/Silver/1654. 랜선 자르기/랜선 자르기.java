import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        long end = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if(end < arr[i]){
                end = arr[i];
            }
        }

        long start = 1;
        end++;

        while (start <= end) {
            long total = 0;
            long mid = (start + end) / 2;
            for (int i = 0; i < n; i++) {
                total += arr[i] / mid;
            }
            if (total < k) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        System.out.println(end);
    }
}

