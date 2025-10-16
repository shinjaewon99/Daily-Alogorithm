import java.util.*; 
class Main { 
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in); 
        
        int n = in.nextInt(); // 동전 종류 
        int k = in.nextInt(); // 동전의 합 
        
        int[] store = new int[n]; 
        
        for(int i = 0; i < n; i++){ 
            store[i] = in.nextInt();
        }
        
        int[] dp = new int[k + 1]; 
        dp[0] = 1; 
        
        // 누적합 구하기 
        for (int i = 0; i < n; i++) { 
            int num = store[i]; 
            for (int j = num; j <= k; j++) { 
                dp[j] += dp[j - num]; 
            } 
        } 
        
        System.out.println(dp[k]); 
    } 
}