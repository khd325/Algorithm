import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;


public class Main {
    public static void main(String[] args) throws IOException {
        HashSet<String> s = new HashSet<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] cnt = new int[4];

        String str = br.readLine();
        boolean check = false;
        for (int i = 0; i < str.length(); i = i + 3) {
            String temp = str.substring(i, i + 3);

            if (s.contains(temp)) {
                check = true;
                break;
            }
            s.add(temp);

            if(temp.charAt(0) == 'P'){
                cnt[0]++;
            }else if(temp.charAt(0) == 'K') {
                cnt[1]++;
            }else if(temp.charAt(0) == 'H') {
                cnt[2]++;
            }else if(temp.charAt(0) == 'T') {
                cnt[3]++;
            }
        }

        if(check){
           sb.append("GRESKA");
        }else {
            for(int i = 0; i < 4; i++){
                sb.append(13 - cnt[i]).append(" ");
            }
        }

        System.out.println(sb);
    }
}
