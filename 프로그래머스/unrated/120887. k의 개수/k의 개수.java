class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int x = i; x <= j; x++){
            String[] temp = String.valueOf(x).split("");
            for(int y = 0; y < temp.length; y++){
                if(temp[y].equals(String.valueOf(k))){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}