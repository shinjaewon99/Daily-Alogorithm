import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        // SK가 이기는 경우를 1, CY가 이기는경우를 2
        int[] dp = new int[1001];
        dp[1] = 1; // 돌이 1개일 경우
        dp[2] = 2;
        dp[3] = 1;

        // 돌의 갯수가 4 이상일때
        // 1, 3 
        // 3, 1
        // 1, 1, 1, 1
        for(int i = 4; i <= number; i++){
            dp[i] = Math.min(dp[i - 1], dp[i - 3]) + 1; 
        }

        if(dp[number] % 2 == 0){
            System.out.println("CY");
        }else{
             System.out.println("SK");
        }
    }
}
