import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        long[] dp = new long[51];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = (1 + dp[i-1] + dp[i-2]) % 1000000007;
        }
        
        System.out.print(dp[n]);
    }
}