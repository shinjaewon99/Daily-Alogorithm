import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt(); // 테스트 케이스 갯수

        // new int[입력한 정수][합을 나타내는수]
        int[][] dp = new int[10001][4];
        dp[1][1] = 1; // 1
        dp[2][1] = 1; // 1 + 1
        dp[2][2] = 1; // 2
        dp[3][1] = 1; // 1 + 1 + 1
        dp[3][2] = 1; // 1 + 2
        dp[3][3] = 1; // 3

        for(int i = 4; i <= 10000; i++){
            dp[i][1] = dp[i - 1][1];
            dp[i][2] = dp[i - 2][1] + dp[i - 2][2];
            dp[i][3] = dp[i - 3][1] + dp[i - 3][2] + dp[i- 3][3]; 
        }

        for(int i = 0; i < t; i++){
            int index = in.nextInt();

            System.out.println(dp[index][1] + dp[index][2] + dp[index][3]);
        }

    }
}