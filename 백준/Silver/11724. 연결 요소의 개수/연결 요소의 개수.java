import java.util.Scanner;

public class Main {

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