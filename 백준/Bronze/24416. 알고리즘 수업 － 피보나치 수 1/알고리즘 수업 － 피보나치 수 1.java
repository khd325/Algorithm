import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int code1 = 1;
    static int code2 = 0;
    static int fib(int n) {

        if (n == 1 || n == 2) {
            return 1;
        } else {
            code1++;
            return fib(n - 1) + fib(n - 2);
        }
    }

    static int fibonacci(int n) {
        int[] arr = new int[n + 1];
        arr[1] = 1;
        arr[2] = 1;

        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            code2++;
        }

        return arr[n];
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        fib(n);
        fibonacci(n);
        System.out.println(code1 + " " + code2);
    }
}
