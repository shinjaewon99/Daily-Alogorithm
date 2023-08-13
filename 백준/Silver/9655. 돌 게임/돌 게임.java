import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1. 돌 갯수 입력
        int stoneNumber = in.nextInt();

        // 2. 요구사항에 맞게 배열 크기 할당 및 dp 배열 값 할당
        // 상근이 이기는경우를 1, 창영이가 이기는 경우를 2로 지정
        int[] dp = new int[1001];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 1;

        // 3. 마지막 돌을 가져가는 사람 검증
        for (int i = 4; i <= stoneNumber; i++) {
            dp[i] = Math.min(dp[i - 3], dp[i - 1]) + 1;
        }

        if (dp[stoneNumber] % 2 == 0) {
            System.out.println("CY");
        }else{
            System.out.println("SK");
        }
    }
}
