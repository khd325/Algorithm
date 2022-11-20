import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        int result = 0;
        int n = A.length;
        for(int i = 0; i < A.length; i++){
            result += A[i] * B[n - i - 1];
        }
        
        return result;
    }
}