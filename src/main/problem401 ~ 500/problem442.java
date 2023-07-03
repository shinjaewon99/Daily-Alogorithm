/*
입력
첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000), 탐색을 시작할 정점의 번호 V가 주어진다. 다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다. 어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다. 입력으로 주어지는 간선은 양방향이다.

출력
첫째 줄에 DFS를 수행한 결과를, 그 다음 줄에는 BFS를 수행한 결과를 출력한다. V부터 방문된 점을 순서대로 출력하면 된다.

예제 입력 1
4 5 1
1 2
1 3
1 4
2 4
3 4
예제 출력 1
1 2 4 3
1 2 3 4
예제 입력 2
5 5 3
5 4
5 2
1 2
3 4
3 1
예제 출력 2
3 1 2 5 4
3 1 4 2 5
예제 입력 3
1000 1 1000
999 1000
예제 출력 3
1000 999
1000 999
*/
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class problem442 {
    static int[][] graph;
    static boolean[] visit;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int v = in.nextInt();

        // 배열 생성
        graph = new int[n + 1][n + 1];

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            // 양방향 관계
            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        visit = new boolean[n + 1];
        DFS(v);
        System.out.println();

        visit = new boolean[n + 1];
        BFS(v);
    }

    static void DFS(int v) {
        visit[v] = true; // 방문 체크

        System.out.print(v + " ");

        // 탈출 조건
        if (v == graph.length) return;

        for (int i = 1; i < graph.length; i++) {
            // 노드가 연결되어있으면서, 방문하지 않은경우
            if (!visit[i] && graph[v][i] == 1) {
                DFS(i);
            }
        }
    }

    static void BFS(int V) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(V);
        visit[V] = true;

        while (!queue.isEmpty()) {
            int temp = queue.poll();
            System.out.print(temp + " ");

            for (int i = 1; i < graph.length; i++) {
                if (graph[temp][i] == 1 && !visit[i]) {
                    queue.add(i);
                    visit[i] = true;
                }
            }
        }
    }
}
