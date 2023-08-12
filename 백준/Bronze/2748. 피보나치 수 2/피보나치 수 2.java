import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1. 정수 n 입력
        int number = in.nextInt();

        System.out.println(fibo(number));
    }

    private static long fibo(int number) {
        // 2. 요구사항의 배열 크기 지정
        long[] dp = new long[91];

        // 3. dp 배열의 값 할당
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        for (int i = 2; i <= number; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[number];
    }
}
