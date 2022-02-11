import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();

        int idx = 0;
        int cnt = 0;
        while(idx <= a.length()-b.length()){
            if(a.substring(idx,idx + b.length()).equals(b)){
                cnt++;
                idx += b.length();
            }else {
                idx++;
            }
        }

        System.out.println(cnt);
    }
}
