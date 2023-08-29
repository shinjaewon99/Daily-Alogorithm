import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    private static int number;
    private static int connect;
    private static int start;
    private static int[][] graph;
    private static boolean[] flag;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1. 정점의 갯수 입력
        number = in.nextInt();

        // 2. 간선의 갯수 입력
        connect = in.nextInt();

        // 3. 탐색을 시작할 번호
        start = in.nextInt();

        // 4. graph 배열 초기화
        graph = new int[number + 1][number + 1];
        flag = new boolean[number + 1];
        for (int i = 1; i <= connect; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            graph[x][y] = graph[y][x] = 1;
        }

        dfs(start);
        System.out.println();

        // 방문 배열 초기화
        flag = new boolean[number + 1];
        bfs(start);
    }
    // 5. dfs 깊이 우선 탐색
    private static void dfs(int start){
        flag[start] = true;

        System.out.print(start + " ");
        for (int i = 1; i <= number; i++) {
            if(!flag[i] && graph[start][i] == 1){
                dfs(i);
            }
        }
    }

    // 6. bfs 넢이 우선 탐색
    private static void bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        flag[start] = true;

        while(!queue.isEmpty()){
            int poll = queue.poll();
            System.out.print(poll + " ");

            // 시작한 번호에서 끝까지 탐색한다.
            for (int i = 1; i <= number; i++) {
                if(!flag[i] && graph[poll][i] == 1){
                    queue.add(i);
                    flag[i] = true;
                }
            }
        }
    }
}
