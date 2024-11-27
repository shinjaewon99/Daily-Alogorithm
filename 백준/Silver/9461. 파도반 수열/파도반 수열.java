import java.util.*;

class Main {
    private static long[] dp;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        int[] store = new int[t];

        for(int i = 0; i < t; i++){
            store[i] = in.nextInt();
        }

        for(int i = 0; i < t; i++){
            System.out.println(getDp(store[i]));
        }
    }

    private static long getDp(final int number){
        dp = new long[101];

        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 2;
        dp[5] = 2;

        for(int i = 6; i <= 100; i++){
            dp[i] = dp[i - 3] + dp[i - 2];
        }

        return dp[number];
    }
}