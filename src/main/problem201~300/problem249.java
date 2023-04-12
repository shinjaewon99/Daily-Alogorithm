/*
문제
방향 없는 그래프가 주어졌을 때, 연결 요소 (Connected Component)의 개수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 정점의 개수 N과 간선의 개수 M이 주어진다. (1 ≤ N ≤ 1,000, 0 ≤ M ≤ N×(N-1)/2) 둘째 줄부터 M개의 줄에 간선의 양 끝점 u와 v가 주어진다. (1 ≤ u, v ≤ N, u ≠ v) 같은 간선은 한 번만 주어진다.

출력
첫째 줄에 연결 요소의 개수를 출력한다.

예제 입력 1
6 5
1 2
2 5
5 1
3 4
4 6
예제 출력 1
2
예제 입력 2
6 8
1 2
2 5
5 1
3 4
4 6
5 4
2 4
2 3
예제 출력 2
1
*/
import java.util.Scanner;

public class problem249 {

    static int n;
    static int m;
    static int[][] graph;
    static boolean visit[];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        graph = new int[1001][1001]; // 범위 지정
        visit = new boolean[1001]; // 범위 지정

        int a, b;
        for (int i = 0; i < m; i++) {
            a = in.nextInt();
            b = in.nextInt();
            graph[a][b] = graph[b][a] = 1; // 간선 연결
        }

        int result = 0;

        // DFS 탐색
        for (int i = 1; i <= n; i++) {
            if (!visit[i]) {
                DFS(i);
                result++;
            }
        }
        System.out.println(result);

    }

    private static void DFS(int input) {
        // 방문한 노드일경우
        if (visit[input]) {
            return;
        }
        // 방문한 노드가 아닐경우
        else {
            visit[input] = true; // 방문처리
            for (int i = 1; i <= n; i++) {
                if (graph[input][i] == 1) {
                    // 연결된 노드가 있으면 노드 깊이까지 탐색
                    DFS(i);
                }
            }
        }
    }
}
