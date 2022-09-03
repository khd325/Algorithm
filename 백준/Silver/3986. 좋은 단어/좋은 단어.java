import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        for (int i = 0; i < n; i++) {
            Stack<Character> s = new Stack<>();

            String str = br.readLine();

            s.push(str.charAt(0));

            for (int j = 1; j < str.length(); j++) {
                char c = str.charAt(j);

                if(!s.isEmpty() && s.peek() == c){
                    s.pop();
                }else {
                    s.push(c);
                }
            }

            if(s.isEmpty()){
                result++;
            }
        }

        System.out.println(result);

    }
}
