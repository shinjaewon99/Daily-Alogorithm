import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt(); // 테스트 케이스의 개수

        while (t-- > 0) {
            int n = in.nextInt(); 
            int[][] store = new int[2][n]; // 스티커 점수 저장 배열

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < n; j++) {
                    store[i][j] = in.nextInt();
                }
            }

            // DP 배열 초기화
            int[][] dp = new int[n][3];
            dp[0][0] = store[0][0]; // 첫 열의 위쪽 스티커 선택
            dp[0][1] = store[1][0]; // 첫 열의 아래쪽 스티커 선택
            dp[0][2] = 0;           // 첫 열의 스티커를 선택하지 않음

            for (int i = 1; i < n; i++) {
                dp[i][0] = Math.max(dp[i-1][1], dp[i-1][2]) + store[0][i];
                dp[i][1] = Math.max(dp[i-1][0], dp[i-1][2]) + store[1][i];
                dp[i][2] = Math.max(dp[i-1][0], dp[i-1][1]);
            }

            int result = Math.max(dp[n-1][0], Math.max(dp[n-1][1], dp[n-1][2]));
            System.out.println(result);
        }
    }
}
