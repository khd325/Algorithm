import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int num = 1;

        while(true){
            st = new StringTokenizer(br.readLine());

            int r = Integer.parseInt(st.nextToken());
            if(r == 0){
                break;
            }


            double a = Math.pow(r * 2,2);
            double b = Math.pow(Integer.parseInt(st.nextToken()),2);
            double c = Math.pow(Integer.parseInt(st.nextToken()),2);


            if(a >= b + c){
                sb.append("Pizza ").append(num).append(" fits on the table.\n");
            }else {
                sb.append("Pizza ").append(num).append(" does not fit on the table.\n");
            }
            num++;
        }

        System.out.println(sb);
    }
}
