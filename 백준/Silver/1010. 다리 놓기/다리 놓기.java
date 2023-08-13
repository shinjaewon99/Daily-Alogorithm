import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder output = new StringBuilder();
        // 1. 테스트 갯수 입력
        int testSize = in.nextInt();

        // 2. dp 배열 요구사항에 맞게 크기 지정
        long[][] dp = new long[31][31];


        // 3. dp 배열의 값 할당
        for (int i = 0; i < 31; i++) {
            dp[i][0] = 1;
            dp[i][i] = 1;
        }


        // 4. 조합 식 구현, 2C1 = 2이다.
        for (int i = 2; i < 31; i++) {
            for (int j = 1; j < 31; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i - 1][j - 1];
            }
        }

        // 5. 서쪽 동쪽 입력, 입력된 정수의 해당하는 dp 배열 할당
        for (int i = 0; i < testSize; i++) {
            int west = in.nextInt();
            int east = in.nextInt();
            output.append(dp[east][west]).append("\n");
        }
        System.out.println(output.toString());
    }
}
