import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1. 계단의 갯수 입력
        int stair = in.nextInt();
        int[] stairs = new int[stair + 1];


        // 2. 계단의 갯수만큼 점수 입력
        for (int i = 1; i <= stair; i++) {
            stairs[i] = in.nextInt();
        }

        // 3. dp 배열 값 할당
        int[] dp = new int[stair + 1];
        dp[1] = stairs[1];

        for (int i = 2; i <= stair; i++) {
            // 4. 계단의 갯수가 2개인경우
            if (i == 2) {
                dp[i] = dp[1] + stairs[2];
            }
            // 5. 계단의 갯수가 3개인 경우
            else if (i == 3) {
                dp[i] = Math.max(stairs[i - 2], stairs[i - 1]) + stairs[i];
            }
            // 6. 계단의 갯수가 4개 이상인경우
            else {
                // 10 20 30 40 50 = 110
                dp[i] = Math.max(dp[i - 3] + stairs[i - 1], dp[i - 2]) + stairs[i];
            }
        }
        // 요구사항에서 마지막계단은 무조건 밟아야 함으로, + stairs[stair]을 해줘야 합니다.
        System.out.println(dp[stair]);
    }
}
