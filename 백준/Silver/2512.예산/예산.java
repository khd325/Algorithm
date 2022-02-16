import java.util.*;
import java.io.*;

public class Main {
    static int[] arr;
    static int n,m;

    static int binarySearch(int target){
        int start = 0;
        int end = Arrays.stream(arr).max().getAsInt();
        while(start <= end){
            int mid = (start + end) / 2;
            int total = 0;

            for(int i = 0; i < n; i++){
                if(arr[i] <= mid) total+= arr[i];
                else total += mid;
            }

            if( total <= target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return end;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        m = Integer.parseInt(br.readLine());
        System.out.println(binarySearch(m));

    }
}