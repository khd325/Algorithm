import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        
        if(arr.length == 1) return new int[]{-1};
        
        int idx = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[idx] > arr[i]){
                idx = i;
            }
        }
        final int min = arr[idx];
        int[] result = Arrays.stream(arr).filter(i -> i != min).toArray();
        
        return result;
    }
}