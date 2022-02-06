
import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int sum = 0;
        int max = 0;
        for(int i = 0; i < 10; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sum = sum - a + b;
            if(sum > max){
                max = sum;
            }
        }
        System.out.println(max);
    }
}
