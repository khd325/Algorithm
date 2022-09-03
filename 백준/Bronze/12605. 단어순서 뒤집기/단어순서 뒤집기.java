import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i =1; i <= n; i++){
            Stack<String> s = new Stack<>();
            sb.append(String.format("Case #%d: ",i));
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                s.push(st.nextToken());
            }

            while(!s.isEmpty()){
                sb.append(s.pop()).append(" ");
            }

            sb.append("\n");
        }

        System.out.println(sb);

    }
}
