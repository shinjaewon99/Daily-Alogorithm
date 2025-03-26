import java.util.*;

/**
ACAYKP
CAPCAK

이러한 입력값일때 최장 공통 부분은
ACAK가 된다.
**/
class Main {
    private static char[] word1;
    private static char[] word2;

    private static Integer[][] dp;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        word1 = in.nextLine().toCharArray();
        word2 = in.nextLine().toCharArray();

        int length1 = word1.length;
        int length2 = word2.length;

        dp = new Integer[length1][length2];

        System.out.println(result(length1 - 1, length2 - 1));
    }

    private static int result(int x, int y){

        // 인덱스 범위를 초과한 경우
        if(x == -1 || y == -1){
            return 0;
        }
        
        // 방문 하지 않았으면
        if(dp[x][y] == null){
            dp[x][y] = 0; // 초기화

            // 같은 문자라면
            if(word1[x] == word2[y]){
                dp[x][y] = result(x - 1, y - 1) + 1;
            }else{
                // 문자열이 같지 않다면, 이전 행과 열 중 최대값
                dp[x][y] = Math.max(result(x - 1, y), result(x, y - 1));
            }
        }
        
        return dp[x][y];
    }
}