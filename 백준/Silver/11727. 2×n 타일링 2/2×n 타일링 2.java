import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        // 1. 정수 n 입력
        int number = Integer.parseInt(in.readLine());

        // 2. dp 배열 값 할당
        int[] dp = new int[1001];

        dp[1] = 1;
        dp[2] = 3;
        dp[3] = 5;

        // 3. 점화식을 이용하여 dp 배열 채우기
        // i번째 칸을 1x2 타일로 채우는 방법(dp[i - 1])과 2x1 타일 두 개를 쌓는 방법(2 * dp[i - 2])의 합
        for (int i = 4; i <= number; i++) {
            dp[i] = (dp[i - 1] + 2 * dp[i - 2]) % 10007;
        }

        System.out.println(dp[number]);

    }
}
