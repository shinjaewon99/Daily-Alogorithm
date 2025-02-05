import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 카드의 갯수
        int[] cards = new int[n + 1];

        for(int i = 1; i <= n; i++){
            cards[i] = in.nextInt();
        }

        int[] dp = new int[n + 1];

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                dp[i] = Math.max(dp[i], dp[i - j] + cards[j]);
            }
        }

        System.out.println(dp[n]);
    }
}