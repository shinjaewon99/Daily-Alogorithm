import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        int[][] dp = new int[41][2];


        // 초기값 설정
        dp[0][0] = 1; // fibo(0)의 0호출 횟수
        dp[0][1] = 0; // fibo(0)의 1호출 횟수
        dp[1][0] = 0; // fibo(1)의 0호출 횟수
        dp[1][1] = 1; // fibo(1)의 1호출 횟수

        for(int i = 2; i < 41; i++){
            dp[i][0] = dp[i - 2][0] + dp[i - 1][0];
            dp[i][1] = dp[i - 2][1] + dp[i - 1][1];
        }
        
        for(int i = 0; i < t; i++){
            int number = in.nextInt();

            System.out.println(dp[number][0] + " " + dp[number][1]);
        }
        
    }
}