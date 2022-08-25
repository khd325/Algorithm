import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine(),",");

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < k; i++){
            int[] temp = new int[arr.length-1];
            for(int j = 0; j < arr.length - 1; j++){

                temp[j] = arr[j+1] - arr[j];
            }
            arr = temp;
        }

        for(int i = 0; i < arr.length; i++){
            sb.append(arr[i]);
            if(i != arr.length -1){
                sb.append(",");
            }
        }

        System.out.println(sb);


    }

}
