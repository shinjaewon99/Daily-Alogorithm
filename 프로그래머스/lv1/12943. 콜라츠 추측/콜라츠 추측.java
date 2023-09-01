class Solution {
    public int solution(int num) {
        int answer = 0;
        long number = num; // 입력값 타입 변환
        if(num == 1){
            return 0;
        }
        while(true){
            // 1. 입력된 수가 짝수라면 2로 나눈다.
            if(number % 2 == 0){
                number /= 2;
            }else{
                number = (number * 3) + 1;
            }
            answer++;
            
            if(number == 1){
                break;
            }
            if(answer > 500){
                return -1;
            }
        }
        
        return answer;
    }
}