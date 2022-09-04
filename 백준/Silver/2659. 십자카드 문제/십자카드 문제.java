import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {
    static boolean check(int num) {

        int temp = num;

        for(int i = 0; i < 3; i++){
            if(temp % 10 == 0){
                return false;
            }

            temp = temp / 10 + 1000 * (temp % 10);

            if(temp < num) return false;
        }

        return true;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken()) * 1000;
        int b = Integer.parseInt(st.nextToken()) * 100;
        int c = Integer.parseInt(st.nextToken()) * 10;
        int d = Integer.parseInt(st.nextToken());

        int num = a + b + c + d;
        int minNum = num;
        for(int i = 0; i < 3; i++){
            minNum = minNum / 10 + 1000 * (minNum%10);
            num = Math.min(minNum,num);
        }

        int result = 1;
        for (int i = 1111; i < num; i++) {
            if(check(i)){
                result++;
            }
        }

        System.out.println(result);
    }
}
