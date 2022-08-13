import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int cnt = 0;
        int result = -1;
        boolean[] check = new boolean[n + 1];

        Arrays.fill(check, true);

        for (int i = 2; i < n + 1; i++) {
            int j = 1;
            if(check[i*j]){
                while (i * j <= n) {
                    if(check[i*j])
                    {
                        check[i*j] = false;
                        cnt++;
                    }
                    if(cnt == k){
                        System.out.println(i*j);
                        System.exit(0);
                    }
                    j++;
                }
            }
        }

    }
}
