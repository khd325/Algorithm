import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        int[] arr = new int [1001];

        int k = 1;
        int idx = 1;
        while(idx < 1001){
            for(int i = 0; i < k; i++){
                arr[idx] = k;
                idx++;
                if(idx == 1001) break;
            }
            k++;
        }

        int sum = 0;
        for(int i = start; i <= end; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
