import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1. 자연수 n 입력
        int number = in.nextInt();
        int[] dp = new int[number + 1];

        // 1 = 1^2
        // 2 = 1^2 + 1^2
        dp[1] = 1;

        // 25 = 4^2 + 3^2 가 아닌 5^2 최소를 선택
        for (int i = 2; i <= number; i++) {
            dp[i] = dp[i - 1] + 1;
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1); // dp 재할당
            }
        }

        System.out.println(dp[number]);
    }
}
