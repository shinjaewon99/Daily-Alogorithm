/*
문제
체스판 위에 한 나이트가 놓여져 있다. 나이트가 한 번에 이동할 수 있는 칸은 아래 그림에 나와있다. 나이트가 이동하려고 하는 칸이 주어진다. 나이트는 몇 번 움직이면 이 칸으로 이동할 수 있을까?



입력
입력의 첫째 줄에는 테스트 케이스의 개수가 주어진다.

각 테스트 케이스는 세 줄로 이루어져 있다. 첫째 줄에는 체스판의 한 변의 길이 l(4 ≤ l ≤ 300)이 주어진다. 체스판의 크기는 l × l이다. 체스판의 각 칸은 두 수의 쌍 {0, ..., l-1} × {0, ..., l-1}로 나타낼 수 있다. 둘째 줄과 셋째 줄에는 나이트가 현재 있는 칸, 나이트가 이동하려고 하는 칸이 주어진다.

출력
각 테스트 케이스마다 나이트가 최소 몇 번만에 이동할 수 있는지 출력한다.

예제 입력 1
3
8
0 0
7 0
100
0 0
30 50
10
1 1
1 1
예제 출력 1
5
28
0
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class problem275 {
    // x,y 좌표로 이동할수있는 경우의수 8가지
    static int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();


        // t가 0이 될떄까지
        while (t-- > 0) {
            int n = in.nextInt(); // 체스판의 한 변의 길이
            int[][] graph = new int[n][n];

            int startX = in.nextInt(); // x의 시작위치
            int startY = in.nextInt(); // y의 시작위치
            int endX = in.nextInt(); // x의 도착위치
            int endY = in.nextInt(); // y의 도착위치

            Queue<int[]> q = new LinkedList<>();
            q.offer(new int[]{startX, startY}); // 시작위치 q의 저장
            graph[startX][startY] = 1; // 이동횟수

            while (!q.isEmpty()) {
                int[] temp = q.poll();
                int x = temp[0];
                int y = temp[1];

                // 현재위치가 목표의 위치에 도달했을경우
                if (x == endX && y == endY) {
                    System.out.println(graph[x][y] - 1);
                    break;
                }


                for (int i = 0; i < 8; i++) {
                    int mX = x + dx[i];
                    int mY = y + dy[i];

                    // 범위 체크
                    if (mX < 0 || mX >= n || mY < 0 || mY >= n) continue;
                    if (graph[mX][mY] != 0) continue;

                    graph[mX][mY] = graph[x][y] + 1;
                    q.offer(new int[]{mX, mY});
                }
            }
        }


    }
}

