import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1. 정수 n 입력
        int n = in.nextInt();

        // 2. 정수 m 입력
        int m = in.nextInt();

        // long의 범위를 벗어나기 때문에 BigInteger 사용
        BigInteger[][] dp = new BigInteger[101][101];

        // 3. nCm 구하기
        // 2C1 = 2
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                // iCj 중 j가 0이나 i랑 같을경우
                if(j == 0 || i == j){
                    dp[i][j] = BigInteger.valueOf(1);
                }else{
                    dp[i][j] = dp[i - 1][j - 1].add(dp[i - 1][j]);
                }
            }
        }
        System.out.println(dp[n][m]);
    }
}
