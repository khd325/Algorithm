import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int idx = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = idx; i <= 8; i++) {
            int num = Integer.parseInt(br.readLine());
            map.put(num, idx++);
            arr.add(num);
        }

        Collections.sort(arr,Collections.reverseOrder());

        List<Integer> result = arr.subList(0, 5);

        Integer sum = result.stream().reduce((a, b) -> (a + b)).get();
        System.out.println(sum);
        int[] ints = result.stream().mapToInt(map::get).sorted().toArray();
        for (int anInt : ints) {
            System.out.printf("%d ",anInt);
        }
    }
}

