import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        boolean[][] flags = new boolean[n + 1][n + 1];

        for(int i = 0; i < m; i++){
            int x = in.nextInt();
            int y = in.nextInt();

            // 맛이 섞이면 안되는 좌표를 표시
            flags[x][y] = true;
            flags[y][x] = true;
        }


        int result = 0;

        // 맛이 섞였는지 비교
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                for (int k = j + 1; k <= n; k++) {
                    // i, j, k 조합이 섞이면 안 되는 조합이 아니면 카운트 증가
                    if (!flags[i][j] && !flags[i][k] && !flags[j][k]) {
                        result++;
                    }
                }
            }
        }
        
        System.out.println(result);
    }
}