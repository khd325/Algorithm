import java.util.Arrays;

class Solution {
    public int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        int a = 0;
        int b = 0;
        int result = 0;

        while(a < A.length && b < B.length) {
            if(A[a] < B[b]) {
                a++;
                b++;
                result++;
            }else {
                b++;
            }
        }

        return result;
    }
}