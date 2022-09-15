import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        int left = 0;
        int right = 0;
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            right += arr[i];
            left = Math.max(left,arr[i]);
        }

        while(left <= right){
            int mid = (left + right) / 2;
            int cnt = 0;
            int temp = 0;
            for(int i = 0; i < arr.length; i++){
                if( temp + arr[i] > mid){
                    temp = 0;
                    cnt++;
                }
                temp += arr[i];
            }
            if(temp > 0){
                cnt++;
            }
            if (cnt <= m){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        System.out.println(left);
    }
}


