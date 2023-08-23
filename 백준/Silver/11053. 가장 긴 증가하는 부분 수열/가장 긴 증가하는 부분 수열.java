import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1. 수열의 크기 입력
        int numberSize = in.nextInt();
        int[] numbers = new int[numberSize + 1];
        int[] dp = new int[numberSize + 1];

        // 2. 수열의 크기에따른 정수 입력
        for (int i = 1; i <= numberSize; i++) {
            numbers[i] = in.nextInt();
        }

        // numbers : 10 20 10 30 20 50
        // dp : 1 2 1 3 2 4
        dp[1] = 1;

        // 3. dp 배열 값 할당
        for (int i = 1; i <= numberSize; i++) {
            dp[i] = 1;
            for (int j = 1; j <= i; j++) {
                if(numbers[j] < numbers[i] && dp[i] <= dp[j]){
                    dp[i] = dp[j] + 1; // dp 배열중 가장 큰 값에 + 1
                }
            }
        }

        // 4. 최대 길이 출력
        int max = 0;
        for (int compare : dp) {
            max = Math.max(compare, max);
        }

        System.out.println(max);
    }
}
