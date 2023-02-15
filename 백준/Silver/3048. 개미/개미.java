import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static class Ant {
        private Character ant;
        private boolean direct;

        public Ant(Character ant, boolean direct) {
            this.ant = ant;
            this.direct = direct;
        }

        public Character getAnt() {
            return ant;
        }

        public boolean isDirect() {
            return direct;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());

        String groupA = br.readLine();
        String groupB = br.readLine();

        List<Ant> list = new ArrayList<>();

        for (int i = n1 - 1; i >= 0; i--) {
            char c = groupA.charAt(i);
            list.add(new Ant(c, true));
        }

        for (int i = 0; i < n2; i++) {
            char c = groupB.charAt(i);
            list.add(new Ant(c, false));
        }

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            for (int i = 0; i < n1 + n2 - 1; i++) {
                if (list.get(i).isDirect() && !list.get(i + 1).isDirect()) {
                    Collections.swap(list, i, i + 1);
                    i++;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Ant ant : list) {
            sb.append(ant.getAnt());
        }

        System.out.println(sb);
    }
}
