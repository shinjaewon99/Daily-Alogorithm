class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int length = triangle.length;
        
        int[][] dp = new int[length][length];
        // 왼쪽 대각선 채우기
        dp[0][0] = triangle[0][0];
        
        for(int i = 1; i < length; i++){
            dp[i][0] = dp[i - 1][0] + triangle[i][0];
        }
        
        for(int i = 1; i < length; i++){
            for(int j = 1; j < triangle[i].length; j++){
                // 삼각형을 아래로 내려가면서 왼쪽과 더한 값과 오른쪽을 더한값을 비교해서 최대값을 저장
                dp[i][j] = Math.max(dp[i - 1][j - 1] + triangle [i][j], dp[i - 1][j] + triangle[i][j]);
            }
        }
        
        for(int i = 0; i < length; i++){
            answer = Math.max(dp[length - 1][i], answer);
        }
       
        return answer;
    }
}