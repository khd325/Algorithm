import java.util.*;
import java.io.*;


public class Main {
    static int n;
    static int[] arr;
    static int[] oper = new int[4];
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    static void dfs(int num, int depth){
        if(depth == n){
            max = Math.max(max,num);
            min = Math.min(min,num);
            return;
        }

        for(int i = 0; i < 4; i++){
            if(oper[i] > 0){
                oper[i]--;
                if(i==0){
                    dfs(num+arr[depth],depth+1);
                }else if( i== 1){
                    dfs(num-arr[depth],depth+1);
                }else if( i== 2){
                    dfs(num*arr[depth],depth+1);
                }else if( i== 3){
                    dfs(num/arr[depth],depth+1);
                }

                oper[i]++;
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 4; i++){
            oper[i] = Integer.parseInt(st.nextToken());
        }
        dfs(arr[0],1);
        System.out.println(max);
        System.out.println(min);
    }
}
