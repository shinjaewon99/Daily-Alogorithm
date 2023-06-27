/*
문제
준규는 N×M 크기의 미로에 갇혀있다. 미로는 1×1크기의 방으로 나누어져 있고, 각 방에는 사탕이 놓여져 있다. 미로의 가장 왼쪽 윗 방은 (1, 1)이고, 가장 오른쪽 아랫 방은 (N, M)이다.

준규는 현재 (1, 1)에 있고, (N, M)으로 이동하려고 한다. 준규가 (r, c)에 있으면, (r+1, c), (r, c+1), (r+1, c+1)로 이동할 수 있고, 각 방을 방문할 때마다 방에 놓여져있는 사탕을 모두 가져갈 수 있다. 또, 미로 밖으로 나갈 수는 없다.

준규가 (N, M)으로 이동할 때, 가져올 수 있는 사탕 개수의 최댓값을 구하시오.

입력
첫째 줄에 미로의 크기 N, M이 주어진다. (1 ≤ N, M ≤ 1,000)

둘째 줄부터 N개 줄에는 총 M개의 숫자가 주어지며, r번째 줄의 c번째 수는 (r, c)에 놓여져 있는 사탕의 개수이다. 사탕의 개수는 0보다 크거나 같고, 100보다 작거나 같다.

출력
첫째 줄에 준규가 (N, M)으로 이동할 때, 가져올 수 있는 사탕 개수를 출력한다.

예제 입력 1
3 4
1 2 3 4
0 0 0 5
9 8 7 6
예제 출력 1
31
예제 입력 2
3 3
1 0 0
0 1 0
0 0 1
예제 출력 2
3
예제 입력 3
4 3
1 2 3
6 5 4
7 8 9
12 11 10
예제 출력 3
47
*/

import java.util.Scanner;

public class problem489 {
    static int n;
    static int m;
    static int[][] graph;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();

        // (1,1) 부터 시작함으로 배열 크기 할당
        graph = new int[n + 1][m + 1];

        /* 입력
           0 0 0 0 0
           0 1 2 3 4
           0 0 0 0 5
           0 9 8 7 6
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                graph[i][j] = in.nextInt();
                // 왼쪽, 위쪽, 왼쪽 대각선의 최대값을 해야 Index 에러가 발생 X
                graph[i][j] += Math.max(graph[i][j - 1],
                        Math.max(graph[i - 1][j], graph[i - 1][j - 1]));
            }
        }
        System.out.println(graph[n][m]);
    }
}
