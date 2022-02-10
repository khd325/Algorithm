import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> hs = new HashSet<>();
        for(int i = 0; i < n; i++){
            hs.add(br.readLine());
        }
        List<String> list = new ArrayList<String>();
        for(int i = 0; i < m; i++){
            String str = br.readLine();
            if(hs.contains(str)){
                list.add(str);
            }
        }

        Collections.sort(list);
        System.out.println(list.size());
        for (String s : list) {
            System.out.println(s);
        }
    }
}
