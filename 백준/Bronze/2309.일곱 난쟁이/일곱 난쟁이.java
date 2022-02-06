import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        int total = 0;
        for (int i = 0; i < 9; i++) {
            int n = Integer.parseInt(br.readLine());
            list.add(n);
            total += n;
        }
        int over = total - 100;
        boolean flag = false;
        int a = 0;
        int b = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == over) {
                    a = list.get(i);
                    b = list.get(j);
                    flag = true;
                }
                if (flag) break;

                if (flag) break;
            }
            if (flag) break;
        }
        list.remove(list.indexOf(a));
        list.remove(list.indexOf(b));

        Collections.sort(list);
        for (Integer i : list) {
            System.out.println(i);
        }


    }
}
