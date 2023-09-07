import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        // 1. int 배열 d를 오름차순으로 정렬
        Arrays.sort(d);
        
        // 2. 배열 d의 숫자보다 budget이 크거나 같을경우만 지원
        for(int i = 0; i < d.length; i++){
            if(budget >= d[i]){
                answer++;
                budget -= d[i];
            }
        }
        
        return answer;
    }
}