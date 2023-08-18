import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1. 테스트 갯수 입력
        int testSize = in.nextInt();
        int[] numbers = new int[testSize];
        int[] dp = new int[12];

        dp[1] = 1; // 1
        dp[2] = 2; // 11, 2
        dp[3] = 4; // 111, 12, 21, 3

        // dp[4] = (1+1+1+1), (1+1+2), (1+2+1), (1+3), (2+1+1), (2+2), (3+1)
        // dp[4] = dp[3] + dp[2] + dp[1]
        // 1로 시작하는 식은 dp[3] 
        // 2로 시작하는 식은 dp[2] 
        // 3으로 시작하는 식은 dp[1]

        // 2. 테스트 갯수만큼 정수 입력
        for (int i = 0; i < testSize; i++) {
            numbers[i] = in.nextInt();

            for (int j = 4; j <= numbers[i]; j++) {
                dp[j] = dp[j - 1] + dp[j - 2] + dp[j - 3];
            }
            System.out.println(dp[numbers[i]]);
        }
    }
}
