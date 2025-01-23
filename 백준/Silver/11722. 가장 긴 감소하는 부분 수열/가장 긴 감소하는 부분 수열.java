import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 수열의 크기
        int[] store = new int[n];
        int[] dp = new int[n];
        
        for(int i = 0; i < n; i++){
            store[i] = in.nextInt();
        }

        Arrays.fill(dp, 1); // 자기자신은 포함 해야됨
        
        for(int i = 1; i < n; i++){
            for(int j = 0; j < i; j++){
                if(store[j] > store[i]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int result = 0;

        for(int i = 0; i < n; i++){
            result = Math.max(result, dp[i]);
        }
        
        System.out.println(result);
    }
}