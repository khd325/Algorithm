import java.util.*;
import java.io.*;


public class Main {
    static int CASE = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int l = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            if (l == 0 && p == 0 && v == 0) break;

            int cnt = 0;
            if (v % p == 0) {
                cnt = (v / p) * l;
            }else{
                int temp = v % p;
                
                if(temp < l) cnt = (v/p) * l + temp;
                else{
                    cnt = (v/p) * l + l;
                }
            }
            System.out.println("Case " + CASE++ + ": " + cnt);

        }


    }
}
