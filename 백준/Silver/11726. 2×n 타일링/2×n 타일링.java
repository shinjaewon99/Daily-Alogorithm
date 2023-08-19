import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        // 1. 정수 n 입력
        int number = Integer.parseInt(in.readLine());
        long[] dp = new long[1001];

        // 2. dp 배열 초기화
        dp[1] = 1;
        dp[2] = 2;

        // 3. 요구사항에 맞는 점화식 찾기
        for (int i = 3; i <= number; i++) {
            dp[i] = (dp[i - 2] + dp[i - 1]) % 10007;
        }

        System.out.println(dp[number]);
    }
}
