import java.util.*;

class Solution {
    static class Score {
        int eng;
        int math;
        int idx;
        double avg;

        public Score(int eng, int math, int idx) {
            this.eng = eng;
            this.math = math;
            this.idx = idx;
            this.avg = (eng + math) / (double) 2;
        }

       
        public int getIdx() {
            return idx;
        }
        

        public double getAvg() {
            return avg;
        }
    }
    
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        List<Score> list = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            list.add(new Score(score[i][0], score[i][1], i));
        }

        list.sort((e1, e2) -> {
            if (e1.getAvg() > e2.getAvg()) {
                return -1;
            } else if (e1.getAvg() < e2.getAvg()) {
                return 1;
            } else {
                return 0;
            }
        });

        int rank = 1;
        int count = 1;
        double curAvg = 0;

        for (int i = 0; i < list.size(); i++) {
            Score s = list.get(i);
            if(s.getAvg() != curAvg){
                curAvg = s.getAvg();
                rank = count;
            }

            answer[s.getIdx()] = rank;
            count++;
        }

        return answer;
    }
}