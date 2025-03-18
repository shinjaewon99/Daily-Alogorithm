import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 상자의 갯수
        int[] numbers = new int[n + 1];
        int[] dp = new int[n + 1];

        for(int i = 1; i <= n; i++){
            numbers[i] = in.nextInt();
            
            // 초기값 설정
            dp[i] = 1;
        }

        int result = 1;

        // 1 6 2 5 7 3 5 6
        for(int i = 1; i <= n; i++){
            for(int j = 1; j < i; j++){
                // 증가하는 수열인지 확인
                if(numbers[j] < numbers[i]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }

            result = Math.max(result, dp[i]);
        }

        System.out.println(result);
    }
}