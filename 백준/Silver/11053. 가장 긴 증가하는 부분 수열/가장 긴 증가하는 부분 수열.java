import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int[] store = new int[size + 1];
        int[] dp = new int[size + 1];

        for(int i = 1; i <= size; i++){
            store[i] = in.nextInt();

            // dp의 최소값은 1
            dp[i] = 1;
        }

        // 최소 길이는 1
        int max = 1;

        // 10, 20, 10, 30, 20, 50
        for(int i = 1; i <= size; i++){
            for(int j = 1; j < i; j++){

                // 이전 배열과 비교해서 다음 배열 값이 큰 경우
                if(store[i] > store[j]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }

            max = Math.max(max, dp[i]);
        }
        
        System.out.println(max);
    }
}