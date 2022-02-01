import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),"-");

        ArrayList<Integer> num = new ArrayList<Integer>();

        while(st.hasMoreTokens()){
            String str = st.nextToken();
            int sum = 0;
            String[] split = str.split("\\+");
            for(int i = 0; i <split.length;i++){
                sum += Integer.parseInt(split[i]);
            }
            num.add(sum);
        }
        int result = 0;
        for(int i = 0; i < num.size();i++){
            if(i != 0){
                num.set(i,-num.get(i));
            }
            result += num.get(i);
        }
        System.out.println(result);
    }
}
