import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] a = new int[n];
        int m = Integer.parseInt(st.nextToken());
        int[] b = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        int[] result = new int[n + m];


        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }

        if (i != a.length) {
            while (i < n) {
                result[k++] = a[i++];
            }
        } else {
            while (j < m) {
                result[k++] = b[j++];
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int x = 0;  x < result.length; x++) {
            sb.append(result[x]).append(" ");
        }

        System.out.println(sb);
    }
}
