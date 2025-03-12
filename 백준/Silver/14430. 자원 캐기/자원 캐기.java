import java.util.*;

class Main {
    private static int n;
    private static int m;
    private static int[][] graph;
    private static int[][] dp;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();
        graph = new int[n][m];
        dp = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                graph[i][j] = in.nextInt();
            }
        }

        // 초기값
        dp[0][0] = graph[0][0];

        // 첫번째 행 초기화
        for(int i = 1; i < m; i++){
            dp[0][i] = dp[0][i - 1] +  graph[0][i];
        }

        
        // 첫번째 열 초기화
        for(int i = 1; i < n; i++){
            dp[i][0] = dp[i - 1][0] + graph[i][0];
        }
        
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + graph[i][j];
            }
        }

        // 마지막 지점 출력
        System.out.println(dp[n - 1][m - 1]);
    }
}