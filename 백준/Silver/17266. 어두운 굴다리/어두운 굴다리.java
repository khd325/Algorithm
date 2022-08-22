import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    static int[] lamp;
    static int n;
    static int m;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        lamp = new int[m];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            lamp[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0;
        int end = n;

        int result = 0;

        while (start <= end) {
            int mid = (start + end) / 2;

            if(check(mid)){
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        System.out.println(result);

    }

    private static boolean check(int mid) {
        int left = 0;

        for(int i = 0; i < lamp.length;i++){

            if (lamp[i] - mid <= left){
                left = lamp[i] + mid;
            } else{
                return false;
            }
        }

        return left >= n;
    }
}