import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            int score = 1;
            boolean flag = true;
            int sum = 0;
            String str = br.readLine();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'X') {
                    flag = false;
                    score = 1;
                } else if(str.charAt(i) == 'O'){
                    if (flag) {
                        sum += score++;
                    }else{
                        flag = true;
                        sum += score++;
                    }
                }
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);

    }
}
