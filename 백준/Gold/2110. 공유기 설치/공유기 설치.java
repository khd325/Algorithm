import java.util.*;
import java.io.*;


public class Main {
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int start = 1;
        int end = arr[n-1];
        int result = 0;

        while(start <= end){
            int mid = (start + end) /2;
            int current = arr[0];
            int cnt = 1;

            for(int i = 0; i < n; i++){
                if(arr[i] >= current + mid){
                    cnt++;
                    current = arr[i];
                }
            }
            if(cnt >= c){
                result = mid;
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        System.out.println(result);
    }
}
