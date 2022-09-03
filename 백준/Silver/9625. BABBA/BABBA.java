import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[46];
        int[] b = new int[46];

        a[0] = 1;
        a[1] = 0;
        a[2] = 1;

        b[0] = 0;
        b[1] = 1;
        b[2] = 1;

        for(int i = 3; i <= 45; i++){
            a[i] = a[i-1] + a[i-2];
            b[i] = b[i-1] + b[i-2];
        }

        System.out.printf("%d %d%n", a[n], b[n]);
    }
}
