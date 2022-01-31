import java.util.*;
import java.io.*;


public class Main {
    static int[] arr = new int[10];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - '0']++;
        }
        int sum = arr[6] + arr[9];
        if (sum % 2 == 0) {
            arr[6] = sum / 2;
            arr[9] = sum / 2;
        } else {
            arr[6] = (sum / 2) + 1;
            arr[9] = (sum / 2) + 1;
        }
        

        System.out.println(Arrays.stream(arr).max().getAsInt());
    }
}
