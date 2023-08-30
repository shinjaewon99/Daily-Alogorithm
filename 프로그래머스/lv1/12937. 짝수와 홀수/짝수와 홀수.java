class Solution {
    public String solution(int num) {
        String answer = "";
        
        // 1. 짝수일 경우
        if(num % 2 == 0){
            answer = "Even";
        }
        // 2. 홀수일 경우
        else{
            answer = "Odd";
        }
        
        return answer;
    }
}