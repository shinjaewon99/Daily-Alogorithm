import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1. 정수의 갯수 입력
        int size = in.nextInt();
        int[] numbers = new int[size + 1];
        int[] dp = new int[size + 1];

        // 2. 정수의 갯수만큼 숫자 입력
        for (int i = 1; i <= size; i++) {
            numbers[i] = in.nextInt();
        }

        // 3. dp 배열 값 할당
        dp[1] = numbers[1];
        int max = numbers[1];

        // 4. 연속된 최대값 찾기
        // 입력값 : 2 1 -4 3 4 -4 6 5 -5 1
        // dp 배열 : 2 3 -1 2 6 2 8 13 8 9
        for (int i = 2; i <= size; i++) {
            dp[i] = Math.max(dp[i - 1] + numbers[i], numbers[i]);
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);
    }
}
