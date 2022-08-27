import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[100001];
        Arrays.fill(arr, Integer.MAX_VALUE);

        arr[2] = 1;
        arr[4] = 2;
        arr[5] = 1;
        if(n >= 6){
            for (int i = 6; i <= n; i++) {
                if (arr[i - 2] != Integer.MAX_VALUE) {
                    arr[i] = Math.min(arr[i - 2] + 1, arr[i]);
                }

                if (arr[i - 5] != Integer.MAX_VALUE) {
                    arr[i] = Math.min(arr[i - 5] + 1, arr[i]);
                }
            }
        }


        if(arr[n] == Integer.MAX_VALUE){
            System.out.println(-1);
        } else {
            System.out.println(arr[n]);
        }
    }
}
