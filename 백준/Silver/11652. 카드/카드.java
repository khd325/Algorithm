import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        HashMap<Long, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            Long num = Long.parseLong(br.readLine());

            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num,1);
            }
        }

        long result = 0;
        int cnt = 0;
        for(Map.Entry<Long,Integer> entry : map.entrySet()){
            if(entry.getValue() > cnt){
                result = entry.getKey();
                cnt = entry.getValue();
            } else if (entry.getValue() == cnt && entry.getKey() < result){
                result = entry.getKey();
            }
        }

        System.out.println(result);
    }
}
