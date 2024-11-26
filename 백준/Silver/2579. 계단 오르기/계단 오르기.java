import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 계단의 갯수
        int[] store = new int[n + 1];
        int[] dp = new int[n + 1];
        
        for(int i = 1; i <= n; i++){
            store[i] = in.nextInt();
        }


        // 초기값 설정
        dp[1] = store[1];

        if(n >= 2) dp[2] = store[1] + store[2];

        for(int i = 3; i <= n; i++){
            dp[i] = Math.max(dp[i - 2] + store[i], dp[i - 3] + store[i - 1] + store[i]);
        }

        System.out.println(dp[n]);
    }
}