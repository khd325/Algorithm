import java.util.*;
import java.io.*;



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Integer[] n = new Integer[str.length()];
        for (int i = 0; i < str.length(); i++) {
            n[i] = str.charAt(i) - '0';
        }

        Arrays.sort(n,Collections.reverseOrder());
        int sum = 0;
        for(int i = 0; i < n.length; i++){
            sum += n[i];
        }
        if(sum % 3 == 0 && n[n.length-1] == 0){
            for (Integer integer : n) {
                System.out.print(integer);
            }
        }else{
            System.out.println(-1);
        }
    }
}
