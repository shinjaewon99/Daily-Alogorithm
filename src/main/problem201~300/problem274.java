/*
문제
<그림 1>과 같이 정사각형 모양의 지도가 있다. 1은 집이 있는 곳을, 0은 집이 없는 곳을 나타낸다. 철수는 이 지도를 가지고 연결된 집의 모임인 단지를 정의하고, 단지에 번호를 붙이려 한다. 여기서 연결되었다는 것은 어떤 집이 좌우, 혹은 아래위로 다른 집이 있는 경우를 말한다. 대각선상에 집이 있는 경우는 연결된 것이 아니다. <그림 2>는 <그림 1>을 단지별로 번호를 붙인 것이다. 지도를 입력하여 단지수를 출력하고, 각 단지에 속하는 집의 수를 오름차순으로 정렬하여 출력하는 프로그램을 작성하시오.



입력
첫 번째 줄에는 지도의 크기 N(정사각형이므로 가로와 세로의 크기는 같으며 5≤N≤25)이 입력되고, 그 다음 N줄에는 각각 N개의 자료(0혹은 1)가 입력된다.

출력
첫 번째 줄에는 총 단지수를 출력하시오. 그리고 각 단지내 집의 수를 오름차순으로 정렬하여 한 줄에 하나씩 출력하시오.

예제 입력 1
7
0110100
0110101
1110101
0000111
0100000
0111110
0111000
예제 출력 1
3
7
8
9
*/
import java.util.Arrays;
import java.util.Scanner;

public class problem274 {
    static int n;
    static int[][] graph;
    static boolean[][] visit;
    static int[] total = new int[25*25]; // 기본 틀 크기
    static int[] moveY = {-1, 1, 0, 0};
    static int[] moveX = {0, 0, -1, 1};
    static int result = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        graph = new int[n][n];
        visit = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String str = in.next();
            for (int j = 0; j < n; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (graph[i][j] == 1 && !visit[i][j]) {
                    result++;
                    DFS(i, j);
                }
            }
        }
        Arrays.sort(total);
        System.out.println(result); // 총 단지수
        for (int i = 0; i < total.length; i++) {
            if (total[i] == 0) {
                continue;
            } else {
                System.out.println(total[i]); // 각 단지내의 집의 수
            }
        }
    }

    private static void DFS(int x, int y) {
        visit[x][y] = true; // 방문 처리
        total[result]++; // DFS가 호출 될때까지는 집이 이어져 있다는 뜻임으로, 증가

        // 상하좌우 이동, 검증
        for (int i = 0; i < 4; i++) {
            int mX = x + moveX[i];
            int mY = y + moveY[i];

            // 범위 검증, 방문 검증
            if (mX >= 0 && mX < n && mY >= 0 && mY < n) {
                if (!visit[mX][mY] && graph[mX][mY] == 1) {
                    DFS(mX, mY);
                }
            }
        }
    }

}

