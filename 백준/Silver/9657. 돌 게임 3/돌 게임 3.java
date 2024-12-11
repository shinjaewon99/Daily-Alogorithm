import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        int[] dp = new int[number + 1];

        if (number == 1) {
            System.out.println("SK");
            return;
        } else if (number == 2) {
            System.out.println("CY");
            return;
        } else if (number == 3) {
            System.out.println("SK");
            return;
        } else if (number == 4) {
            System.out.println("SK");
            return;
        }
        
        dp[1] = 1;
        dp[2] = 0;
        dp[3] = 1;
        dp[4] = 1;

        
        // 돌의 갯수가 5일때 부터
        for(int i = 5; i <= number; i++){
            // 1, 3, 4개만 가져갈 수 있음
            if((dp[i - 1] & dp[i - 3] & dp[i - 4]) == 0){
                dp[i] = 1;
            }else{
                dp[i] = 0;
            }
        }


        if(dp[number] == 1){
            System.out.println("SK");
        }else{
            System.out.println("CY");
        }
    }
}