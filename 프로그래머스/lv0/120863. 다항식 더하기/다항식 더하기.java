class Solution {
    public String solution(String polynomial) {
        String answer = "";

        String[] strs = polynomial.split(" ");
        int[] nums = new int[2];
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].equals("+")){
                continue;
            }

            if (strs[i].contains("x")) {
                if(strs[i].length() == 1){
                    nums[0] += 1;
                }else {
                    nums[0] += Integer.parseInt(strs[i].replaceAll("x", ""));
                }
            } else {
                nums[1] += Integer.parseInt(strs[i]);
            }
        }

        if(nums[0] == 1){
            answer += "x";
        } else if(nums[0] != 0){
            answer += nums[0] + "x";
        }

        if(nums[1] == 0){
            return answer;
        }else {
            if(nums[0] != 0){
                answer += " + ";
            }
            answer += nums[1];
        }

        return answer;
    }
}