import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int cnt = 0;
        int idx = 0;

        for(int i = 0;;){
            while(arr[idx] - arr[i] + 1 <= l){
                idx++;
                if(idx == n){
                    break;
                }
            }
            i = idx;
            if(i == n){
                cnt++;
                break;
            }
            cnt++;
        }



        System.out.println(cnt);
    }
}
