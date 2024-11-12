import java.util.*;

class Main {
    private static long[] dp = new long[68];
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        koong(); // 호출 후 초기화 
        
        for(int i = 0; i < t; i++){
            System.out.println(dp[in.nextInt()]);
        }
    }

    private static void koong(){
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;


        for(int i = 4; i < 68; i++){
             dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3] + dp[i - 4];
        }
    }
}