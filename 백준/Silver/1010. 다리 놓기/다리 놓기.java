import java.util.*;

public class Main {
    private static final int[][] dp = new int[30][30];
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int test = in.nextInt();


        for(int i = 0; i < test; i++){
            int n = in.nextInt();
            int m = in.nextInt();
            
            int result = build(n , m);

            System.out.println(result);
        }
    }

    private static int build(int n, int m){

        // 조합에서 nC0, nCn = 1
        for(int i = 0; i < 30; i++){
            dp[i][0] = 1;
            dp[i][i] = 1;
        }

        // 2C1 은 2
        for(int i = 2; i < 30; i++){
            for(int j = 1; j < 30; j++){
                dp[i][j] = dp[i - 1][j] + dp[i - 1][j - 1];
            }
        }

        return dp[m][n];
    }
}
