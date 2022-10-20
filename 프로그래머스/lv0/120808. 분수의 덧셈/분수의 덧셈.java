class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int numerator = denum1 * num2 + denum2 * num1;
        int denominator = num1 * num2;
        
        int n = 1;
        
        for(int i = 1; i <= denominator; i++){
            if(numerator % i == 0 && denominator % i == 0){
                n = i;
            }
        }
        
        numerator /= n;
        denominator /= n;
        
        return new int[]{numerator,denominator};
    }
}