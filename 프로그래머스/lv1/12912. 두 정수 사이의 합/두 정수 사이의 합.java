class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        // 1. b가 a보다 크거나 같을경우
        if(a <= b){
            for(int i = a; i <= b; i++){
                answer += i;
            }
        }
        // 2. 그 외의 경우
        else{
            for(int i = b; i <= a; i++){
                answer += i;
            }
        }
        
        return answer;
    }
}