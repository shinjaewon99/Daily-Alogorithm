class Solution {
    public int solution(int number, int limit, int power) {
        
        int[] div = new int[number + 1];
          
        // 첫번째 입출력 일 경우
        // 첫번째 loop : 1 1 1 1 1 
        // 두번째 loop : 1 2 1 2 1 
        // 세번째 loop : 1 2 2 2 1
        // 네번째 loop : 1 2 2 3 1
        // 다섯 번째 loop : 1 2 2 3 2
        for(int i = 1; i <= number; i++){
            for(int j = i; j <= number; j+=i){
                div[j]++;
            }
        }
        
        // 1. limit 변수와 비교하여 answer 변수에 값 계산
        int answer = 0;
        for(int i = 1; i <= number; i++){
            if(div[i] > limit) answer += power;
            if(div[i] <= limit) answer += div[i];
        }
        
        return answer;
    }
}