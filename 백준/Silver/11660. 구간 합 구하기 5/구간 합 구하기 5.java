import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[][] store = new int[n + 1][n + 1];  
        int[][] sum = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                store[i][j] = in.nextInt();
            }
        }

        // 누적합 계산
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                sum[i][j] = store[i][j] 
                          + sum[i - 1][j] 
                          + sum[i][j - 1] 
                          - sum[i - 1][j - 1];
            }
        }

        StringBuilder sb = new StringBuilder();
        
        while (m-- > 0) {
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int x2 = in.nextInt();
            int y2 = in.nextInt();

            int result = sum[x2][y2]
                       - sum[x1 - 1][y2]
                       - sum[x2][y1 - 1]
                       + sum[x1 - 1][y1 - 1];

            sb.append(result).append("\n");
        }

        System.out.print(sb);
    }
}
