import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[][] dp = new int[n + 1][3];
        final int div = 9901;

        // 초기값 설정
        dp[1][0] = 1; // 첫 줄에 사자가 없는 경우
        dp[1][1] = 1; // 첫 줄에 왼쪽 칸에 사자가 있는 경우
        dp[1][2] = 1; // 첫 줄에 오른쪽 칸에 사자가 있는 경우

        // DP 점화식 계산
        for (int i = 2; i <= n; i++) {
            dp[i][0] = (dp[i - 1][0] + dp[i - 1][1] + dp[i - 1][2]) % div; 
            dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % div; 
            dp[i][2] = (dp[i - 1][0] + dp[i - 1][1]) % div; 
        }

        int result = (dp[n][0] + dp[n][1] + dp[n][2]) % div;
        System.out.println(result);
    }
}
