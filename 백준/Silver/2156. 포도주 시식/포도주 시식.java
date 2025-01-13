import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 잔의 갯수
        int[] store = new int[n + 1];
        int[] dp = new int[n + 1];
        
        for(int i = 1; i <= n; i++){
            store[i] = in.nextInt();
        }

        if(n >= 1) dp[1] = store[1];
        if(n >= 2) dp[2] = store[1] + store[2];
        
        // 연속으로 3잔을 마실순 없음
        // 잔의 갯수가 3개일때 경우의수
        // 1 2, 1 3, 2 3
        for(int i = 3; i <= n; i++){
            dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2] + store[i], dp[i - 3] + store[i - 1] + store[i]));
        }
        
        System.out.println(dp[n]);
    }
}