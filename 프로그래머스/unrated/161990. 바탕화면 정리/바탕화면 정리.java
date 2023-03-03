class Solution {
    public int[] solution(String[] wallpaper) {
        char[][] arr = new char[wallpaper.length][];

        for (int i = 0; i < arr.length; i++) {
            String s = wallpaper[i];
            arr[i] = s.toCharArray();
        }

        int lux = 51;
        int luy = 51;
        int rdx = 0;
        int rdy = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                char c = arr[i][j];

                if (c == '#') {
                    lux = Math.min(i, lux);
                    luy = Math.min(j, luy);
                    rdx = Math.max(i + 1, rdx);
                    rdy = Math.max(j + 1, rdy);
                }
            }
        }

        return new int[]{lux, luy, rdx, rdy};
    }
}