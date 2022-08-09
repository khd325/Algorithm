import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();

        int result = a.length();

        for(int i = 0; i <= b.length() - a.length();i++){
            int cnt = 0;
            for(int j = 0; j < a.length();j++){
                    if(a.charAt(j) != b.charAt(i+j)){
                    cnt++;
                }
            }

            result = Math.min(cnt,result);
        }

        System.out.println(result);
    }

}
