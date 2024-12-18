import java.util.*;

class Main {
    private static int h;
    private static int w;
    private static int[][] graph;
    private static boolean[][] visited;
    private static int[] dx = {0, 0, 1, -1, 1, 1, -1, -1};
    private static int[] dy = {1, -1, 0, 0, 1, -1, 1, -1};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            w = in.nextInt(); // 너비
            h = in.nextInt(); // 높이

            if (w == 0 && h == 0) {
                break;
            }

            graph = new int[h][w];
            visited = new boolean[h][w];

            // 지도 입력
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    graph[i][j] = in.nextInt();
                }
            }

            int count = 0;

            // 모든 좌표를 순회
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (graph[i][j] == 1 && !visited[i][j]) {
                        dfs(i, j);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }

        in.close();
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true; // 방문처리리

        for (int i = 0; i < 8; i++) { // 상하좌우 + 대각선 탐색
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < h && ny < w) {
                if (graph[nx][ny] == 1 && !visited[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
    }
}
