import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    private static int n;
    private static int m;
    private static int v;
    private static int[][] graph;
    private static boolean[] flag;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt(); // 정점의 갯수
        m = in.nextInt(); // 간선의 갯수
        v = in.nextInt(); // 탐색을 시작할 정점의 번호

        graph = new int[n + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            graph[x][y] = graph[y][x] = 1; // 간선 양방향
        }
        flag = new boolean[n + 1];
        dfs(v);

        System.out.println();

        flag = new boolean[n + 1]; // flag 배열 초기화, BFS 탐색을 하기위해
        bfs(v);
    }

    private static void dfs(int num){
        flag[num] = true; // 방문 체크

        System.out.print(num + " ");

        for (int i = 1; i <= n; i++) {
            if(!flag[i] && graph[num][i] == 1){
                dfs(i);
            }
        }
    }

    private static void bfs(int num){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(num); // 큐 객체에 삽입
        flag[num] = true;
        
        while(!queue.isEmpty()){
            int poll = queue.poll();
            System.out.print(poll + " ");

            for (int i = 1; i <= n; i++) {
                if(!flag[i] && graph[poll][i] == 1){
                    queue.add(i); // 너비 탐색을 위한 삽입
                    flag[i] = true; // 방문처리
                }
            }
        }
    }
}
