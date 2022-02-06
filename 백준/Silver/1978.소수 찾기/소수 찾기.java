import java.util.*;
import java.io.*;


public class Main {
    static Integer[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int cnt = 0;
        for(int i = 0; i < n; i++){
            boolean flag = false;
            int k = Integer.parseInt(st.nextToken());
            if(k == 1) continue;
            else{
                for(int j = 2; j < k; j++){
                    if( k % j == 0) flag = true;
                }
            }
            if(!flag) cnt++;
        }
        System.out.println(cnt);
    }
}
