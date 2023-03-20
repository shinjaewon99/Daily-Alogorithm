/*
문제
N×M크기의 배열로 표현되는 미로가 있다.

1	0	1	1	1	1
1	0	1	0	1	0
1	0	1	0	1	1
1	1	1	0	1	1
미로에서 1은 이동할 수 있는 칸을 나타내고, 0은 이동할 수 없는 칸을 나타낸다. 이러한 미로가 주어졌을 때, (1, 1)에서 출발하여 (N, M)의 위치로 이동할 때 지나야 하는 최소의 칸 수를 구하는 프로그램을 작성하시오. 한 칸에서 다른 칸으로 이동할 때, 서로 인접한 칸으로만 이동할 수 있다.

위의 예에서는 15칸을 지나야 (N, M)의 위치로 이동할 수 있다. 칸을 셀 때에는 시작 위치와 도착 위치도 포함한다.

입력
첫째 줄에 두 정수 N, M(2 ≤ N, M ≤ 100)이 주어진다. 다음 N개의 줄에는 M개의 정수로 미로가 주어진다. 각각의 수들은 붙어서 입력으로 주어진다.

출력
첫째 줄에 지나야 하는 최소의 칸 수를 출력한다. 항상 도착위치로 이동할 수 있는 경우만 입력으로 주어진다.

예제 입력 1
4 6
101111
101010
101011
111011
예제 출력 1
15
예제 입력 2
4 6
110110
110110
111111
111101
예제 출력 2
9
예제 입력 3
2 25
1011101110111011101110111
1110111011101110111011101
예제 출력 3
38
예제 입력 4
7 7
1011111
1110001
1000001
1000001
1000001
1000001
1111111
예제 출력 4
13
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class problem219 {
    // 우 / 좌
    static int[] dx = {0, 1, 0, -1};
    // 하 / 상
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] visit;
    static int[][] maze;
    static int n, m;

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        n = in.nextInt(); // 열
        m = in.nextInt(); // 행

        // 행과 열 배열 지정
        maze = new int[n][m];
        visit = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            String st = in.next();
            for (int j = 0; j < m; j++) {
                // 정수값으로 변환후 저장
                maze[i][j] = st.charAt(j) - '0';
            }
        }
        visit[0][0] = true; //시작점
        BFS(0, 0);
        // 인덱스는 0부터 시작하기때문 -1
        System.out.print(maze[n - 1][m - 1]);
    }

    private static void BFS(int i, int j) {
        // 값이 2개가 들어옴으로 int[]로 선언
        Queue<int[]> q = new LinkedList<>();
        // 처음 시작점을 넣어준다.
        q.add(new int[]{i, j});
        // BFS를 실행할수 없을때 까지.
        while (!q.isEmpty()) {
            int[] now = q.poll();
            int nowX = now[0];
            int nowY = now[1];
            // 상 하 좌 우 탐색 (4로지정)
            for (int p = 0; p < 4; p++) {
                int x = nowX + dx[p];
                int y = nowY + dy[p];
                // 정의한 배열의 범위를 넘는경우
                if (x >= 0 && y >= 0 && x < n && y < m) {
                    // 배열의 값이 0, 방문한 경우
                    if (maze[x][y] != 0 && !visit[x][y]) {
                        // 다음에 갈 노드를 설정
                        q.add(new int[]{x, y});
                        visit[x][y] = true;
                        // 지나온 depth의 값을 저장하기위해 +1을 하여 저장한다.
                        maze[x][y] = maze[nowX][nowY] + 1;

                    }
                }
            }
        }

    }
}



