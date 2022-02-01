import java.util.*;
import java.io.*;

public class Main {
    static int[][] p;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            p = new int[n][2];
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                p[j][0] = a;
                p[j][1] = b;
            }


            Arrays.sort(p, (e1, e2) -> e1[0] - e2[0]);
            int cnt = 1;
            int min= p[0][1];
            for (int j = 1; j < n; j++) {
                if (min > p[j][1]) {
                    min = p[j][1];
                    cnt++;
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }
}
