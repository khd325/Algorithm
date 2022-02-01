import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        int[] m = {500,100,50,10,5,1};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = 1000 - Integer.parseInt(br.readLine());
        int result = 0;
        for(int i = 0; i < m.length;i++) {
            if (m[i] <= n) {
                result += n / m[i];
                n %= m[i];
            }
        }

        System.out.println(result);
    }
}
