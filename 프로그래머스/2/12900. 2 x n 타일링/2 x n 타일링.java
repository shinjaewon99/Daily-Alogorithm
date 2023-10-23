class Solution {
    public int solution(int n) {
        
        // 1. dp 배열 선언
        int[] tile = new int[n + 1];
        
        // 2. dp 배열 값 할당
        tile[1] = 1;
        tile[2] = 2;
        
        // 3. 3부터 탐색
        for(int i = 3; i <= n; i++){
            tile[i] = (tile[i - 2] + tile[i - 1]) % 1000000007;
        }
        
        return tile[n];
    }
}