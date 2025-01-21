import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 사람의 수
        int[] hps = new int[n];
        int[] happy = new int[n];

        for (int i = 0; i < n; i++) {
            hps[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
             happy[i] = in.nextInt();
        }

        // dp 선언
        int[] dp = new int[101];

        for(int i = 0; i < n; i++){
            // 체력 감소에 따른 기쁨 값 측정
            for(int j = 100; j >= hps[i]; j--){
                dp[j] = Math.max(dp[j], dp[j - hps[i]] + happy[i]);
            }
        }

        int max = 0;
        for(int i = 1; i < 100; i++){
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);
    }
}
