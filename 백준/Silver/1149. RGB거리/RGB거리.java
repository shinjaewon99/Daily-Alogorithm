import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] graph = new int[n][3]; // 빨강, 초록, 파랑의 색칠 비용 저장
        
        for(int i = 0; i < n; i++){
            graph[i][0] = in.nextInt();
            graph[i][1] = in.nextInt();
            graph[i][2] = in.nextInt();
        }

        int[][] dp = new int[n][3];

        // 값 초기화
        dp[0][0] = graph[0][0];
        dp[0][1] = graph[0][1];
        dp[0][2] = graph[0][2];
        
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + graph[i][0];  // 빨강
            dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + graph[i][1];  // 초록
            dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + graph[i][2];  // 파랑
        }

        System.out.println(Math.min(Math.min(dp[n-1][0], dp[n-1][1]), dp[n-1][2]));
    }
}