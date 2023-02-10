import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    static class Birth{
        String name;
        Calendar calendar;

        public Birth(String name, Calendar calendar) {
            this.name = name;
            this.calendar = calendar;
        }

        public String getName() {
            return name;
        }

        public Calendar getCalendar() {
            return calendar;
        }
    }

    static void calculate(List<Birth> list, StringTokenizer st) {
        String name = st.nextToken();
        int day = Integer.parseInt(st.nextToken());
        int month = Integer.parseInt(st.nextToken());
        int year = Integer.parseInt(st.nextToken());

        Calendar calendar = Calendar.getInstance();
        calendar.set(year,month,day);

        list.add(new Birth(name,calendar));

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        List<Birth> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());


        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            calculate(list,st);
        }

        Collections.sort(list, (b1,b2) -> b2.getCalendar().compareTo(b1.getCalendar()));

        System.out.println(list.get(0).getName());
        System.out.println(list.get(list.size()-1).getName());

    }
}