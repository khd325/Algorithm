import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int[] armor = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            armor[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(armor);

        int left = 0;
        int right = n - 1;
        int result = 0;
        while (left < right) {
            if (armor[left] + armor[right] == m) {
                left++;
                result++;
            }else if (armor[left] + armor[right] < m){
                left++;
            }else if (armor[left] + armor[right] > m){
                right--;
            }

        }

        System.out.println(result);
    }

}
