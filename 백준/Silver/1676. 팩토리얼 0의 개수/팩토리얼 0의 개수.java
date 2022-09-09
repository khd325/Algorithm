import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigDecimal bigDecimal = new BigDecimal(1L);
        int n = Integer.parseInt(br.readLine());

        for(int i = 2; i <= n; i++){
            bigDecimal = bigDecimal.multiply(new BigDecimal(i));
        }

        String s = bigDecimal.toString();
        int count = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) - '0' == 0){
                count++;
            }else{
                break;
            }
        }

        System.out.println(count);
    }
}
