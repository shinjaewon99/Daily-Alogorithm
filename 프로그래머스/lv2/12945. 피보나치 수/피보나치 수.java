class Solution {
    public int solution(int n) {
        int answer = 0;
       
        // 1. dp 배열 선언
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        
        for(int i = 2; i <= n; i++){
            dp[i] = (dp[i - 2] + dp[i - 1]) % 1234567;
        }
        answer = dp[n];
        
        return answer;
    }
}