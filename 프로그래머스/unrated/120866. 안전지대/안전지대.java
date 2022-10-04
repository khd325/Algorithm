import java.util.Arrays;

class Solution {
    static void danger(int x, int y, int[][] check) {
        int[] dx = {-1, -1, -1, 0, 1, 1, 1, 0};
        int[] dy = {-1, 0, 1, 1, 1, 0, -1, -1};

        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < check.length && ny < check.length) {
                check[nx][ny] = 1;
            }
        }
    }
    
    public int solution(int[][] board) {
        int[][] check = new int[board.length][board.length];

        for (int i = 0; i < board.length; i++) {
            check[i] = Arrays.copyOfRange(board[i], 0, board[i].length);
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) {
                    danger(i, j, check);
                }
            }
        }
        
        return (int) Arrays.stream(check).flatMapToInt(Arrays::stream).filter(x -> x == 0).count();
        
    }
}