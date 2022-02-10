import java.util.*;
import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine()," ");
            int r = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            for(int j = 0; j < str.length();j++){
                for(int k = 0; k < r; k++){
                    sb.append(str.charAt(j));
                }
            }
            System.out.println(sb);
            sb.setLength(0);
        }

    }
}
