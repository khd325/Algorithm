import java.util.*;
import java.io.*;

public class Main {
    static int[][] p;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer[] arr = new Integer[26];
        Arrays.fill(arr,0);

        int n = Integer.parseInt(br.readLine());
        String[] str = new String[n];
        for(int i = 0; i < n; i++){
            str[i] = br.readLine();
            int unit = (int) Math.pow(10,str[i].length()-1);

            for(int j = 0 ; j < str[i].length();j++){
                arr[str[i].charAt(j)-'A']+= unit;
                unit /= 10;
            }
        }
        Arrays.sort(arr,Collections.reverseOrder());

        int result = 0;
        int num = 9;
        for(int i = 0; i < arr.length;i++){
            if(arr[i] == 0) break;
            result += arr[i] * num--;
        }

        System.out.println(result);

    }
}
