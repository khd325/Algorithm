import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

        for(int i = 0; i < n; i++){
            list.add(new ArrayList<>());
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                list.get(i).add(Integer.parseInt(st.nextToken()));
            }
        }


        for(int i = n-2; i >= 0; i--){
            for(int j = 0; j < list.get(i).size(); j++){
                int temp = 0;
                temp = Math.max(list.get(i+1).get(j),list.get(i+1).get(j+1));
                list.get(i).set(j,temp+list.get(i).get(j));
            }
        }

        System.out.println(list.get(0).get(0));
    }
}