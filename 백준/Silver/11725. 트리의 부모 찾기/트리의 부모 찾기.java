import java.util.*;

class Main {
    private static int n;
    private static List<Integer>[] store;
    private static int[] graph;
    private static boolean[] visit;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt(); // 노드의 갯수
        store = new ArrayList[n + 1];
        graph = new int[n + 1];
        visit = new boolean[n + 1];

        for(int i = 1; i <= n; i++){
            store[i] = new ArrayList<>();
        }

        for(int i = 0; i < n - 1; i++){
            int x = in.nextInt();
            int y = in.nextInt();

            // 양방향으로 처리
            store[x].add(y);
            store[y].add(x);
        }

        // 루트 노드인 1부터 시작
        dfs(1);

        for(int i = 2; i <= n; i++){
            System.out.println(graph[i]);    
        }        
    }

    private static void dfs(final int depth) {
        visit[depth] = true; // 방문처리

        for(int next : store[depth]){ // 현재 노드와 연결되 노드 찾기
            if(!visit[next]){
                graph[next] = depth;

                dfs(next);
            }
        }
    }
}