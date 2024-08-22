class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for(int i = 0; i < nums.length - 2; i++){
            for(int j = i + 1; j < nums.length - 1; j++){
                for(int k = j + 1; k < nums.length; k++){
                    if(checkNumber(nums[i], nums[j], nums[k])){
                        answer++;   
                    }
                }
            }
        }

        return answer;
    }
    private boolean checkNumber(int num1, int num2, int num3){
        int result = num1 + num2 + num3;
        
        // 1은 소수가 아님
        if(result <= 1) return false;
        
        // 2, 3은 소수 임
        if(result <= 3) return true;
        
        // 2, 3으로 나눈 나머지가 0은 소수가 아님
        if(result % 2 == 0 || result % 3 == 0) return false;
        
        for(int i = 5; i <= Math.sqrt(result); i++){
            if(result % i == 0) return false;
        }
    
        return true;
    }
}