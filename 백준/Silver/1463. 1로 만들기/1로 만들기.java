import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1. 정수 N 입력
        int number = in.nextInt();
        int[] dp = new int[number + 1];

        // 2. dp 배열 값 초기화 
        dp[0] = 0;
        dp[1] = 0;

        // dp[3] = 1
        // dp[4] = 2
        // dp[5] = 3
        //.. dp[9] = 2;
        for (int i = 2; i <= number; i++) {
            dp[i] = dp[i - 1] + 1;

            // 2로 나눠질 경우
            if(i % 2 == 0){
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }

            // 3으로 나눠질 경우
            if(i % 3 == 0){
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }
        System.out.println(dp[number]);
    }
}
