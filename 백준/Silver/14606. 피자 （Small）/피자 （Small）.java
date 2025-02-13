import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] dp = new int[11];

        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 3;

        for(int i = 4; i <= n; i++){
            dp[i] = i - 1 + dp[i - 1];
        }

        System.out.println(dp[n]);
    }
}
