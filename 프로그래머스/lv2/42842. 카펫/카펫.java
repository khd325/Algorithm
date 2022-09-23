class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int area = brown + yellow;
        
        for(int i = area-1; i >= 1; i--){
            if(area % i == 0){
                int width = i;
                int height = area / width;
                
                if ((width - 2) * (height - 2) == yellow){
                    // int b = area - (width - 2) * (height - 2);
                    // if(b == brown){
                        answer[0] = width;
                        answer[1] = height;
                        break;
                    // }
                }
            }
        }
    
        return answer;
        
    }
}