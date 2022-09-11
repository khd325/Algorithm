import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Long> s = new HashSet<>();

        int n  = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            s.add(Long.parseLong(st.nextToken()));
        }

        long num = 1L;
        while(true){
            if(!s.contains(num)){
                System.out.println(num);
                break;
            }
            num++;
        }


    }
}
