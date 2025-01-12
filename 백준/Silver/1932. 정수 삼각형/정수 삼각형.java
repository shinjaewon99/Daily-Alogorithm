import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[][] store = new int[n][n]; // 삼각형 저장

        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                store[i][j] = in.nextInt();
            }
        }

        int[][] dp = new int[n][n];
        dp[0][0] = store[0][0]; // 초기값 설정

        for(int i = 1; i < n; i++){
            for(int j = 0; j <= i; j++){
                // 맨 왼쪽 열
                if(j == 0) {
                    dp[i][j] = dp[i - 1][j] + store[i][j];
                }  else if(j == i) {
                    dp[i][j] = dp[i - 1][j - 1] + store[i][j]; // 맨 오른쪽 열
                }else {
                    // 나머지 열은 dp의 윗배열에서 큰 값을 찾은다음 기준값을 더해줌
                    dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + store[i][j]; 
                }
                
            }
        }

        // 최대값 찾기
        int max = 0;
        for(int i = 0; i < n; i++){
            max = Math.max(max, dp[n - 1][i]);
        }
        System.out.println(max);
    }
}