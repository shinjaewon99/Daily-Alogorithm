class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i = 0; i < signs.length; i++){
            // 1. 논리값이 true일 경우 
            if(signs[i]){
                answer += absolutes[i];
            }
            // 2. 논리값이 false일 경우
            else{
                answer -= absolutes[i];
            }
        }
        
        return answer;
    }
}