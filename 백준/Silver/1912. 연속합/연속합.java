import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] store = new int[n + 1];
        int[] dp = new int[n + 1];
        
        for(int i = 1; i <= n; i++){
            store[i] = in.nextInt();
        }

        dp[1] = store[1];
        int max = store[1];

        for(int i = 2; i <= n; i++){
            // 연속된 합 vs 현재 인덱스값
            dp[i] = Math.max(dp[i - 1] + store[i], store[i]);
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);
    }
}