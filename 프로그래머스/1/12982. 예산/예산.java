import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int total = 0;
      
        Arrays.sort(d);
        
        // 1. 예산(budget) 보다 작으면 부서 증가
        for(int i = 0; i < d.length; i++){
            total += d[i];
            if(total <= budget){
                answer++;
            }
        }
        
        
        
        return answer;
    }
}