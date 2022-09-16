import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[7];
        int sum = 0;
        for(int i = 0; i < 7; i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(arr[i] % 2 != 0){
                sum += arr[i];
            }
        }

        if(sum != 0){
            System.out.println(sum);
            System.out.println(Arrays.stream(arr).filter(x -> x % 2 != 0).min().getAsInt());
        }else {
            System.out.println(-1);
        }
    }
}
