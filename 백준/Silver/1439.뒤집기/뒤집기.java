import java.util.*;
import java.io.*;

public class Main {
    static int[][] p;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] arr = new int[2];

        arr[str.charAt(0) -'0']++;


        for(int i = 1; i < str.length();i++){
            if(str.charAt(i) != str.charAt(i-1)){
                if(str.charAt(i) - '0' == 0){
                    arr[0]++;
                }else if (str.charAt(i) -'0' == 1){
                    arr[1]++;

                }
            }
        }
        int result = Math.min(arr[0],arr[1]);
        System.out.println(result);

    }
}
