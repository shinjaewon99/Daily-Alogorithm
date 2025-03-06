import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int[] dp = new int[k + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        
        // 시작점
        dp[n] = 0;

        for(int i = n; i < k; i++){
            // 아직 도달 하지 못한 경우
            if(dp[i] == Integer.MAX_VALUE) continue;


            // 1. +1 연산
            if(i + 1 <= k){
                dp[i + 1] = Math.min(dp[i + 1], dp[i] + 1);
            }

            // 2. *2 연산
            if(i * 2 <= k){
                dp[i * 2] = Math.min(dp[i * 2], dp[i] + 1);
            }
        }
        System.out.println(dp[k]);
    }
}