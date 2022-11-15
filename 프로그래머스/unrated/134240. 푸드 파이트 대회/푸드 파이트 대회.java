class Solution {
    public String solution(int[] food) {
        String result = "";
        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                result += i;
            }
        }

        StringBuilder sb = new StringBuilder();
        String right = sb.append(result).reverse().toString();

        result += "0" + right;

        return result;
    }
}