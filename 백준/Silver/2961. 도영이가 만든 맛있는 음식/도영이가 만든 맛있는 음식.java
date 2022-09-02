import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    static void dfs(int idx, int depth) {
        if (depth == index) {
            long a = 1;
            long b = 0;

            for (int i = 0; i < index; i++) {
                a *= sTemp[i];
                b += bTemp[i];
            }
            if (Math.abs(a - b) < result) {
                result = Math.abs(a - b);
            }
            return;
        }

        for (int i = idx; i < n; i++) {
            bTemp[depth] = bArr[i];
            sTemp[depth] = sArr[i];
            dfs(i + 1, depth +1);
        }
    }


    static int n;
    static long result = Long.MAX_VALUE;
    static long[] sArr;
    static long[] sTemp;
    static long[] bArr;
    static long[] bTemp;
    static int index = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        sArr = new long[n];
        bArr = new long[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());

            sArr[i] = a;
            bArr[i] = b;
        }

        for (int i = 1; i <= n; i++) {
            sTemp = new long[index];
            bTemp = new long[index];
            dfs(0, 0);
            index++;
        }
        System.out.println(result);
    }
}
