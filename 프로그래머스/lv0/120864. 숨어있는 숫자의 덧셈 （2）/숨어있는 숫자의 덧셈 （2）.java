class Solution {
    public int solution(String my_string) {
        String[] split = my_string.split("[A-Za-z]");
        int sum = 0;
        
        for(int i = 0; i < split.length; i++){
            if(!split[i].equals("")) {
                sum += Integer.parseInt(split[i]);
            }
        }
        return sum;
    }
}