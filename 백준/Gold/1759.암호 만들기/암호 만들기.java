import java.util.*;
import java.io.*;

public class Main {
    static int l;
    static int c;
    static String[] arr;
    static String[] result;
    static boolean[] visited;
    static void dfs(int start,int depth){
        if(depth == l){
            int a = 0;
            int b = 0;
            for (String s : result) {
                if(s.equals("a" ) ||s.equals("e" ) ||s.equals("i" ) ||s.equals("o" ) ||s.equals("u" )){
                    a++;
                }else{
                    b++;
                }
            }
            if( a >=1 && b>= 2){
                for (String s : result) {
                    System.out.print(s);
                }
                System.out.println();
            }
            return;
        }

        for(int i = start; i < arr.length;i++){
            if(!visited[i]){
                visited[i] = true;
                result[depth] = arr[i];
                dfs(i+1,depth+1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        l = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        result = new String[l];
        arr = new String[c];
        visited = new boolean[c];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < c;i++){
            arr[i] = st.nextToken();
        }
        Arrays.sort(arr);
        dfs(0,0);
    }
}