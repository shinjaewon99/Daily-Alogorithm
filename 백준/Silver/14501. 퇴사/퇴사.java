import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        int[] t = new int[number]; // 소요되는 일
        int[] p = new int[number]; // 점수

        for(int i = 0; i < number; i++){
            t[i] = in.nextInt();
            p[i] = in.nextInt();
        }
        
        int[] dp = new int[number + 1];

        for(int i = 0; i < number; i++){
            if(i + t[i] <= number) { 
            	dp[i + t[i]] = Math.max(dp[i + t[i]], dp[i] + p[i]);
            }
          
            dp[i+1] = Math.max(dp[i+1], dp[i]);
        }
        System.out.println(dp[number]);

    }
}