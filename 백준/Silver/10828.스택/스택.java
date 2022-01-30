import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        Stack<Integer> s = new Stack<>();
        for(int i = 0;i < n; i++){
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if(command.equals("push")){
                int tmp = Integer.parseInt(st.nextToken());
                s.push(tmp);
            }
            else if(command.equals("pop")){
                if(s.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    sb.append(s.pop()).append("\n");
                }
            }
            else if(command.equals("size")){
                sb.append(s.size()).append("\n");
            }
            else if(command.equals("empty")){
                if(s.isEmpty()){
                    sb.append(1).append("\n");
                }else{
                    sb.append(0).append("\n");
                }
            }else if(command.equals("top")){
                if (s.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    sb.append(s.peek()).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}