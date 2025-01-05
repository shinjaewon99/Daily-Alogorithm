import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt(); // 테스트 케이스의 개수
        int[] numbers = new int[t];
        int max = 0;

        // 입력 처리 및 최대값 계산
        for (int i = 0; i < t; i++) {
            numbers[i] = in.nextInt();
            max = Math.max(max, numbers[i]);
        }

        // 나머지 연산 기준
        int divNumber = 1_000_000_009;
        int[] dp = new int[max + 1];

        // DP 초기값 설정
        if (max >= 1) dp[1] = 1; // n = 1 일 때 경우의 수는 1
        if (max >= 2) dp[2] = 2; // n = 2 일 때 경우의 수는 2
        if (max >= 3) dp[3] = 4; // n = 3 일 때 경우의 수는 4

        // DP 점화식 계산
        for (int i = 4; i <= max; i++) {
            dp[i] = ((dp[i - 1] + dp[i - 2]) % divNumber + dp[i - 3]) % divNumber;
        }

        // 결과 출력
        StringBuilder output = new StringBuilder();
        for (int n : numbers) {
            output.append(dp[n]).append("\n");
        }
        System.out.println(output);
    }
}
