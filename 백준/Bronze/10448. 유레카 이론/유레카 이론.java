import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int[] nums = new int[51];

        for (int i = 0; i <= 50; i++) {
            nums[i] = (i * (i + 1)) / 2;
        }

        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            boolean check = false;
            for (int i = 1; i < 50; i++) {
                if(check){
                    break;
                }
                for (int j = 1; j < 50; j++) {
                    if(check){
                        break;
                    }
                    for (int k = 1; k < 50; k++) {
                        if(nums[i] + nums[j] + nums[k] == n){
                            check = true;
                            break;
                        }
                    }
                }
            }
            if(check){
                System.out.println(1);
            }else {
                System.out.println(0);
            }
        }
    }
}
