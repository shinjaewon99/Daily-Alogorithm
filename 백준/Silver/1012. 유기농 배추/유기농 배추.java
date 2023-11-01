import java.util.Scanner;

public class Main {
    static int n;
    static int m;
    static int t;
    static int count;
    static int[][] graph;
    static boolean[][] visit;
    static int result;
    static int[] moveX = {0, 0, -1, 1};
    static int[] moveY = {-1, 1, 0, 0};


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        t = in.nextInt(); // 테스트 갯수


        for (int i = 0; i < t; i++) {
            result = 0; // 결과값 초기화
            n = in.nextInt(); // 행의 갯수
            m = in.nextInt(); // 열의 갯수
            count = in.nextInt(); // 배추가 심어져있는 위치 갯수
            graph = new int[n][m];
            visit = new boolean[n][m];
            for (int j = 0; j < count; j++) {
                int x = in.nextInt();
                int y = in.nextInt();
                graph[x][y] = 1; // 배추가 있는 위치를 1로 초기화
            }

            for (int k = 0; k < n; k++) {
                for (int p = 0; p < m; p++) {
                    // 배열 크기만큼 탐색한다.
                    if (!visit[k][p] && graph[k][p] == 1) {
                        DFS(k, p);
                        result++;
                    }
                }
            }
            System.out.println(result);
        }


    }

    private static void DFS(int x, int y) {
        visit[x][y] = true; // 방문처리

        for (int i = 0; i < 4; i++) {
            int mX = x + moveX[i];
            int mY = y + moveY[i];

            // 값 범위 검증
            if (mX >= 0 && mX < n && mY >= 0 && mY < m) {
                // 방문 X, 배추가있는지 검증
                if (!visit[mX][mY] && graph[mX][mY] == 1) {
                    DFS(mX, mY);
                }
            }
        }

    }
}