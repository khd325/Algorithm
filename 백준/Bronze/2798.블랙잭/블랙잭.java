import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine()," ");

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;

        for(int i = 0 ; i < n; i++){
            for(int j = i+1; j < n; j++){
                for(int k = j + 1; k < n; k++){
                    int tmp = 0;
                    tmp = arr[i]+arr[j]+arr[k];
                    if (tmp > sum && tmp <= m)
                        sum = tmp;
                }
            }
        }

        System.out.println(sum);

    }
}
