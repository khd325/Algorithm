import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        Stack<Character> s = new Stack<>();
        while (true) {
            str = br.readLine();
            s.clear();
            if (str.equals(".")) break;
            boolean check = true;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == '(' || c == '[') {
                    s.push(c);
                } else {
                    if (c == ')') {
                        if (s.isEmpty() || s.peek() == '[') {
                            check = false;
                            break;
                        } else if (s.peek() == '(') {
                            s.pop();
                        }

                    } else if (c == ']') {
                        if (s.isEmpty() || s.peek() == '(') {
                            check = false;
                            break;
                        } else if (s.peek() == '[') {
                            s.pop();
                        }
                    }
                }
            }
            if (check && s.isEmpty()) {
                sb.append("yes\n");
            } else {
                sb.append("no\n");
            }

        }
        System.out.println(sb);
    }
}