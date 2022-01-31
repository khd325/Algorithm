
import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> s = new Stack<>();
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        int count = 0;
        for(int i = 0 ; i < str.length();i++){
            char c= str.charAt(i);
            if(c == '('){
                s.push(c);
            }else if(c == ')'){
               if(str.charAt(i-1) == '('){
                   s.pop();
                   count += s.size();
               }else if (str.charAt(i-1) ==')'){
                   s.pop();
                   count += 1;
               }
            }
        }
        System.out.println(count);
    }
}