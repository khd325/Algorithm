class Solution {
    public int solution(int[] num_list, int n) {
        int[] arr = new int[101];
        
        for(int i = 0; i < num_list.length; i++){
            arr[num_list[i]]++;
        }
        
        if(arr[n] == 0) return 0;
        else return 1;
    }
}