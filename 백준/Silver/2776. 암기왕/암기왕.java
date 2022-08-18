import java.io.*;
import java.util.*;

public class Main {

    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            HashSet<Integer> set = new HashSet<>();

            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < n; i++){
                set.add(Integer.parseInt(st.nextToken()));
            }
            
            int m = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            
            for(int i = 0; i < m; i++){
                if(set.contains(Integer.parseInt(st.nextToken()))){
                    sb.append("1\n");
                }else {
                    sb.append("0\n");
                }
            }
        }

        System.out.println(sb);
    }
}



