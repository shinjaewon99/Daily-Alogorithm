import java.util.*;
import java.math.BigInteger;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // 테스트 케이스 개수
        StringBuilder output = new StringBuilder();

        BigInteger[] dp = new BigInteger[10001];
        dp[1] = dp[2] = new BigInteger("1");

        for(int i = 3; i < 10001; i++){
            dp[i] = dp[i - 2].add(dp[i - 1]);
        }

        for(int i = 1; i <= t; i++){
            int p = in.nextInt();
            int q = in.nextInt();

            output.append("Case #").append(i).append(": ");

            output.append(dp[p].remainder(BigInteger.valueOf(q))).append("\n");
        }

        System.out.println(output.toString());
    }
}
