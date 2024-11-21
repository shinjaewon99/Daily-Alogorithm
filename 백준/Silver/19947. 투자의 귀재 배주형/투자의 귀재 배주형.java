import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int h = in.nextInt(); // 초기비용
        int y = in.nextInt(); // 투자 기간

        int[] dp = new int[y + 1];
        dp[0] = h;

        for(int i = 1; i <= y; i++){

            dp[i] = (int)(dp[i - 1] * 1.05); // 정수형으로 타입 캐스팅

            // 3년의 이자와, 1년 1년 1년의 이자를 비교해서 MAX를 구함
            if(i >= 3) {
                dp[i] = Math.max((int)(dp[i - 3] * 1.20), dp[i]);
            }
            if(i >= 5) {
                dp[i] = Math.max((int)(dp[i - 5] * 1.35), dp[i]);
            }
        }
        
        System.out.println(dp[y]);
    }
}