import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Long[] tips = new Long[n];

        for (int i = 0; i < n; i++) {
            tips[i] = Long.parseLong(br.readLine());
        }

        Arrays.sort(tips, (e1,e2) -> {
            if (e1 < e2) {
                return 1;
            }else if (e1>e2){
                return -1;
            }
            return 0;
        });

        long result = 0L;
        int rank = 1;
        for(int i = 1; i <= n ; i++){
            long tip = tips[i-1] - (rank -1);
            if(tip > 0 ){
                result += tip;
                rank++;
            }else {
                break;
            }
        }
        System.out.println(result);
    }
}
