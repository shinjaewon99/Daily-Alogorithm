import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1. 수열의 크기 입력
        int size = in.nextInt();
        int[] numbers = new int[size + 1];
        int[] dp = new int[size + 1];

        // 2. 수열 크기에대한 정수 입력
        for (int i = 1; i <= size; i++) {
            numbers[i] = in.nextInt();
        }
        dp[1] = numbers[1];

        // 3. 증가하는 부분에서 합이 가장 큰 경우 찾기
        for (int i = 2; i <= size; i++) {
            dp[i] = numbers[i]; // 비교할 dp 배열 초기화
            for (int j = 1; j < i; j++) {
                if (numbers[j] < numbers[i]) {
                    dp[i] = Math.max(dp[j] + numbers[i], dp[i]);
                }
            }
        }

        // 4. 저장된 dp 배열중 최대값 출력
        int max = Integer.MIN_VALUE;

        for (int result : dp) {
            max = Math.max(result, max);
        }

        System.out.println(max);

    }
}
