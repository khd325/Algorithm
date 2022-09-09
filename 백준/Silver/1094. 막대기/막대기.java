import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int[] arr = new int[1];

        arr[0] = 64;

        while (true) {
            if (Arrays.stream(arr).sum() == x) {
                break;
            }

            if (Arrays.stream(arr).sum() >= x) {
                arr = Arrays.copyOf(arr, arr.length + 1);
                arr[0] /= 2;
                arr[arr.length - 1] = arr[0];
            }

            int sum = Arrays.stream(Arrays.copyOfRange(arr, 1, arr.length)).sum();

            if(sum >= x){
                arr = Arrays.copyOfRange(arr,1,arr.length);
            }
            Arrays.sort(arr);
        }
        System.out.println(arr.length);
    }
}
