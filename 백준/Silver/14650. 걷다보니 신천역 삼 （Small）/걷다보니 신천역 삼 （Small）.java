import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] dp = new int[10];

        // 0,1,2 를 사용해서 2자리 3의 배수는 2개
        dp[2] = 2;

        for(int i = 3; i <= n; i++){
            dp[i] = dp[i - 1] * 3;
        }

        System.out.print(dp[n]);
    }
}