import java.util.*;

class Main {
    private static int[] dp;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        dp = new int[11];
        int[] store = new int[t];

        for(int i = 0; i < t; i++){
            store[i] = in.nextInt();
        }

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for(int i = 0; i < t; i++){
            System.out.println(calcu(store[i]));
        }
    }

    private static int calcu(final int number){

        for(int i = 4; i <= number; i++){
            dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
        }

        return dp[number];
    }
}