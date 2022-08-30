import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int p = arr[i];
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (p == cnt) {
                    if(result[j] == 0){
                        result[j] = i + 1;
                        sb.append(result[j]).append(" ");
                        break;
                    }
                    else{
                        continue;
                    }
                }
                if (result[j] != 0) {
                    continue;
                } else {
                    cnt++;
                }
            }
        }
        for (int i : result) {
            System.out.printf("%d ",i);
        }


    }
}
