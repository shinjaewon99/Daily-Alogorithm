class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int total = 0;
        
        // 1. 3중 반복문을 통해 배열 완전 탐색
        for(int i = 0; i < nums.length - 2; i++){
            for(int j = i + 1; j < nums.length - 1; j++){
                for(int k = j + 1; k < nums.length; k++){
                    total = nums[i] + nums[j] + nums[k];
                    
                    // 2. 소수일 경우 answer 증가
                    if(check(total)){
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
    
    // 3. 소수 판별 메소드
    private boolean check(int number){
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
