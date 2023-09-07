class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
    // 1. 3중 for문을 통해 number 배열을 탐색하여 3개의 숫자를 더해서 0이 되는 경우를 찾습니다.
        for(int i = 0; i < number.length; i++){
            for(int j = i + 1; j < number.length; j++){
                for(int k = j + 1; k < number.length; k++){
                    if(number[i] + number[j] + number[k] == 0){
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
}