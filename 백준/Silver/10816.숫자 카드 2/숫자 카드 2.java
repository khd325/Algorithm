import java.util.*;
import java.io.*;


public class Main {
    static int[] arr = new int[20000001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(st.nextToken());
            arr[k+10000000]++;
        }
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < m; i++){
            sb.append(arr[Integer.parseInt(st.nextToken())+10000000]).append(" ");
        }

        System.out.println(sb);
    }
}
