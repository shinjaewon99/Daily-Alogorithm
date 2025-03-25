import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder output = new StringBuilder();

        long[] dp = new long[31];

        dp[0] = 1; 
        dp[1] = 1; // WH
        dp[2] = 2; // WH, HW

        for(int i = 3; i <= 30; i++){
            long count = 0;

            for(int j = 0; j < i; j++){
                count += dp[j] * dp[i - 1 - j]; 
            }

            dp[i] = count;
        }

        while(true){
            int number = in.nextInt();
            if(number == 0) break;

            
            output.append(dp[number] + "\n");
        }

        System.out.println(output.toString());
    }
}