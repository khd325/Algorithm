import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < n; i++) {
            boolean check = true;
            String str = br.readLine();
            s.clear();
            for(int j = 0; j <str.length();j++){
                char c = str.charAt(j);
                if(c == '('){
                    s.push(c);
                }
                else if(c == ')'){
                    if(s.isEmpty()){
                        check = false;
                        break;
                    }else{
                        s.pop();
                    }
                }
            }
            if(check && s.isEmpty()){
                sb.append("YES").append("\n");
            }else{
                sb.append("NO").append("\n");
            }
        }
        System.out.println(sb);
    }
}