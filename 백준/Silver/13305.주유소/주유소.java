import java.util.*;
import java.io.*;



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int n = Integer.parseInt(br.readLine());
        long[] d = new long[n-1];
        long[] price = new long[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0;i < d.length ;i++){
            d[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < price.length;i++){
            price[i] = Integer.parseInt(st.nextToken());
        }
        long min_price = price[0];
        long result = min_price * d[0];

        for(int i = 1; i < n-1;i++){
            if(price[i] < min_price){
                min_price = price[i];
            }
            result += min_price * d[i];
        }

        System.out.println(result);

    }
}
