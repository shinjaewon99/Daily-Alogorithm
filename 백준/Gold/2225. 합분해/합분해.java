import java.util.*;

class Main {
    private static int n;
    private static int k;
    private static int[][] dp;
    private static int count;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        k = in.nextInt();

        dp = new int[k + 1][n + 1];

        Arrays.fill(dp[1], 1);

        for(int i = 1; i <= k; i++){
            dp[i][0] = 1;
        }

        for(int i = 2; i <= k; i++){
            for(int j = 1; j <= n; j++){
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                dp[i][j] %= 1000000000;
            }
        }

        System.out.println(dp[k][n]);
    }
}
