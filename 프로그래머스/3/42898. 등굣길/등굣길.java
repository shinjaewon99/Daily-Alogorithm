class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int div = 1_000_000_007;
        int[][] graph = new int[n + 1][m + 1]; // [1,1] 부터 시작
        
        // 물에 잠긴 지역 표시
         for(int i = 0; i < puddles.length; i++) {
            graph[puddles[i][1]][puddles[i][0]] = -1; 
        }
        
        graph[1][1] = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if (graph[i][j] == -1) {
                    continue;
                }
                if(graph[i - 1][j] > 0) graph[i][j] += graph[i - 1][j] % div; // 위쪽에서 오는 경로
                if(graph[i][j - 1] > 0) graph[i][j] += graph[i][j - 1] % div; // 왼쪽에서 오는 경로
            }
        }
        
        return graph[n][m] % div;
    }
}