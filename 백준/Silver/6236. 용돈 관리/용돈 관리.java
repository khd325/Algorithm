import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int result = 0;

        int start = Arrays.stream(arr).max().getAsInt();
        int end = 10000 * 100000;
        while (start <= end) {
            int mid = (start + end) / 2;

            int cnt = countCheck(arr,mid);
            if (cnt > m){

                start = mid + 1;
            } else {
                result = mid;
                end = mid - 1;
            }
        }
        System.out.println(result);


    }

    static int countCheck(int[] arr, int mid){
        int count = 1;
        int cur = mid;

        for (int i = 0; i < arr.length; i++) {

            if ( cur - arr[i] < 0){
                count++;
                cur = mid - arr[i];
            }else {
                cur -= arr[i];
            }
        }

        return count;
    }
}