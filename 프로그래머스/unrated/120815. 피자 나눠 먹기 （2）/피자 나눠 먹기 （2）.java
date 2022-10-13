class Solution {
    static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        
        return gcd(b, a % b);
    }
    
    public int solution(int n) {
        int GCD = gcd(6,n);
        
        return (6 * n)  / GCD / 6; 
        
         
    }
}