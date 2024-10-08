class Solution {
    public int solution(int n) {
        // 다이나믹 프로그래밍으로 접근
        int[] dp = new int[100001];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        
        for(int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 2] + dp[i - 1]) % 1234567;
        }
        
        return dp[n];
    }
}