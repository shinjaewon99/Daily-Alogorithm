import java.util.*;

class Main {
    private static int[] dx = {-1,1,0,0};
    private static int[] dy = {0,0,-1,1};
    private static int n;
    private static int m;
    private static char[][] graph;
    private static boolean[][] visit;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();
        in.nextLine();
        graph = new char[n][m];
        visit = new boolean[n][m];

        int startX = 0;
        int startY = 0;

        for(int i = 0; i < n; i++){
            String word = in.nextLine();
            for(int j = 0; j < m; j++){
                graph[i][j] = word.charAt(j);

                // 도연이 위치
                if(graph[i][j] == 'I'){
                    startX = i;
                    startY = j;
                }
            }
        }

        int result = bfs(startX, startY);

        if(result > 0){
            System.out.println(result);
        }else{
            System.out.println("TT");
        }
    }

    private static int bfs(int x, int y){
        Queue<int[]> store = new LinkedList<>();
        store.offer(new int[]{x, y});
        visit[x][y] = true;

        int count = 0;
        
        while(!store.isEmpty()){
            int[] xy = store.poll();

            int mx = xy[0];
            int my = xy[1];

            if(graph[mx][my] == 'P'){
                count++;
            }

            for (int i = 0; i < 4; i++) {
                int nx = mx + dx[i];
                int ny = my + dy[i];

                // 범위 내에 있고, 방문하지 않았으며, 벽('X')이 아닌 경우 탐색
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && !visit[nx][ny] && graph[nx][ny] != 'X') {
                    store.offer(new int[]{nx, ny});
                    visit[nx][ny] = true;
                }
            }
        }

        return count;
    }
}