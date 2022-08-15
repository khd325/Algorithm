import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;
        String str = "";

        while((str = br.readLine()) != null){
            int[] cnt = new int[4];
            sb = new StringBuilder();
            for(int i = 0; i < str.length(); i++){
                if(Character.isLowerCase(str.charAt(i))){
                    cnt[0]++;
                }else if(Character.isUpperCase(str.charAt(i))){
                    cnt[1]++;
                }else if(Character.isDigit(str.charAt(i))){
                    cnt[2]++;
                }else if(str.charAt(i)== ' '){
                    cnt[3]++;
                }
            }
            sb.append(cnt[0]).append(" ").append(cnt[1]).append(" ").append(cnt[2]).append(" ").append(cnt[3]);
            System.out.println(sb);


        }


    }
}



