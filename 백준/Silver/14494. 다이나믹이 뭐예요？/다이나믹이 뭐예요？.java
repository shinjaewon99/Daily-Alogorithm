import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int mod = 1000000007;
        long[][] dp = new long[n + 1][m + 1];

        dp[1][1] = 1; // 시작점

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 && j == 1) continue;
                
                dp[i][j] = dp[i - 1][j] % mod + dp[i][j - 1] % mod;
                
                if (i > 1 && j > 1) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j - 1]) % mod; // 대각선 이동 추가
                }

                dp[i][j] %= mod; // 나머지 연산 적용
            }
        }

        System.out.println(dp[n][m]);
    }
}
