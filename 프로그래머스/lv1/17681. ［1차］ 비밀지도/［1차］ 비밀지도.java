class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
        
        for(int i = 0; i < n; i++){
            String s = Integer.toBinaryString(arr1[i] | arr2[i]);
            
            s = String.format("%" + n + "s",s);
            s = s.replace("1","#");
            s = s.replace("0"," ");
            
            result[i] = s;
        }
        
        return result;
    }
}