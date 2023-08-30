class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 1. 아리스토텔레스의 체를 활용하여 제곱근 까지만 검증
        for(int i = 1; i <= Math.abs(n); i++){
            if(n % i == 0){
                answer += i;
            }
        }
        
        
        return answer;
    }
}