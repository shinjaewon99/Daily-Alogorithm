import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        // dp 문제에서는 배열을 한개 더 크게만든다.
        int[] dp = new int[num + 1];


        // dp에서는 초기값 초기화가 중요
        dp[1] = 0;


        // 입력값이 3일 경우, 1을 빼면 연산횟수 2회 3을 나누면 1회
        for (int i = 2; i <= num; i++) {
            dp[i] = dp[i - 1] + 1;

            if (i % 2 == 0) dp[i] = Math.min(dp[i], dp[i / 2] + 1); 
            if (i % 3 == 0) dp[i] = Math.min(dp[i], dp[i / 3] + 1);
        }

        System.out.println(dp[num]);
    }
}
