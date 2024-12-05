import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        int[] dp = new int[number + 1];
        dp[1] = 1;

        for(int i = 2; i <= number; i++){
            dp[i] = i; // 최대값은 1^2개로 i개 사용

            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        

        System.out.println(dp[number]);
    }
}