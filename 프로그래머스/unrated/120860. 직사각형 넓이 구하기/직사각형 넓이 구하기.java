class Solution {
    public int solution(int[][] dots) {
        int minX = 256;
        int minY = 256;
        int maxX = -256;
        int maxY = -256;
        
        for(int i = 0; i < dots.length; i++){
            if(dots[i][0] < minX){
                minX = dots[i][0];
            }
            if(dots[i][1] < minY){
                minY = dots[i][1];
            }
        }
        
        for(int i = 0; i < dots.length; i++){
            if(dots[i][0] > minX){
                maxX = dots[i][0];
            }
            if(dots[i][1] > minY){
                maxY = dots[i][1];
            }
        }
        
        return (maxX - minX) * (maxY - minY);
        
        
    }
}