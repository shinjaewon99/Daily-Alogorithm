import java.util.*;

class Main {
    private static int n; // 정점의 갯수
    private static int m; // 간선의 갯수
    private static int start;
    private static int[][] graph;
    private static boolean[] visit;
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        start = in.nextInt();

        graph = new int [n + 1][n + 1];
        visit = new boolean[n + 1];

        for(int i = 0; i < m; i++){
            int x = in.nextInt();
            int y = in.nextInt();

            // 양방향으로 표시
            graph[x][y] = graph[y][x] = 1;
        }

        dfs(start);
        System.out.println();

        // 방문 배열 초기화
        visit = new boolean[n + 1];
        bfs(start);
    }

    private static void dfs(int depth){
        visit[depth] = true; // 방문 처리
        System.out.print(depth + " ");

        for(int i = 1; i <= n; i++){
            if(!visit[i] && graph[depth][i] == 1){
                dfs(i);
            }
        }
    }

    private static void bfs(int depth) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(depth);
        visit[depth] = true;
        
        while(!queue.isEmpty()){

            int number = queue.poll();
            System.out.print(number + " ");

            // 너비로 탐색
            for(int i = 1; i <= n; i++){
                if(!visit[i] && graph[number][i] == 1){
                    queue.add(i);
                    visit[i] = true;
                }
            }
        }
    }
}