
import java.util.*;
import java.io.*;


public class Main {
    static Integer[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T;i++){
            st = new StringTokenizer(br.readLine());
            arr = new Integer[10];
            for(int j = 0; j < 10; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr,Collections.reverseOrder());

            sb.append(arr[2]).append("\n");
        }
        System.out.println(sb);
    }
}
