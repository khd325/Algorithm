import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = 1;
        while (true) {
            int n = Integer.parseInt(br.readLine());

            if(n == 0){
                break;
            }

            ArrayList<String> arr = new ArrayList<>();

            for(int i = 0; i < n; i++){
                arr.add(br.readLine());
            }
            int[] check = new int[n];

            for(int i = 0; i < 2*n-1; i++){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                check[a-1]++;
            }

            for(int i = 0; i < n; i++){
                if(check[i] == 1){
                    System.out.println(t + " " + arr.get(i));
                }
            }
            t++;
        }
    }
}

