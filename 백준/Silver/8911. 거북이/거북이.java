import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int minX = 0;
            int minY = 0;
            int maxX = 0;
            int maxY = 0;
            int d = 0;
            int x = 0;
            int y = 0;
            String command = br.readLine();

            for (int i = 0; i < command.length(); i++) {
                char c = command.charAt(i);

                if (c == 'F') {
                    x += dx[d];
                    y += dy[d];
                } else if (c == 'B') {
                    x -= dx[d];
                    y -= dy[d];
                } else if (c == 'L') {
                    d = d - 1;
                    if (d < 0) {
                        d = 3;
                    }
                } else if (c == 'R') {
                    d = d + 1;
                    if (d > 3){
                        d = 0;
                    }
                }

//                System.out.printf("%d %d\n",x,y);

                minY = Math.min(y,minY);
                maxY = Math.max(y,maxY);
                minX = Math.min(x,minX);
                maxX = Math.max(x,maxX);
            }
//            System.out.printf("%d %d %d %d\n",minY,maxY,minX,maxX);
            int width = Math.abs(minX) + Math.abs(maxX);
            int height = Math.abs(minY) + Math.abs(maxY);

            System.out.println(width*height);
        }

    }
}