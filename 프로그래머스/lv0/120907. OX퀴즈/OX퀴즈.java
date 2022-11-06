class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < answer.length; i++) {
            String s = quiz[i];
            String[] s1 = s.split(" ");

            int num1 = Integer.parseInt(s1[0]);
            int num2 = Integer.parseInt(s1[2]);
            int result = 0;
            if(s1[1].equals("+")){
                result = num1 + num2;
            }else if (s1[1].equals("-")){
                result = num1 - num2;
            }

            answer[i] = result == Integer.parseInt(s1[s1.length - 1]) ? "O" : "X";
        }
        return answer;
    }
}