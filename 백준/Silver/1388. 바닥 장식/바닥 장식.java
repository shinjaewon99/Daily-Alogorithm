import java.util.*;

class Main {
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

        for(int i = 0; i < n; i++){
            String word = in.next();
            for(int j = 0; j < m; j++){
                graph[i][j] = word.charAt(j);
            }
        }

        int count = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                // 방문하지 않은경우
                if(!visit[i][j]){
                    dfs(i, j);
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    private static void dfs(int x, int y){
        visit[x][y] = true; // 방문 처리
        char type = graph[x][y];

        // 가로일때
        if(type == '-'){
            // 오른쪽으로 이동
            int moveY = y + 1;
            while(moveY < m && graph[x][moveY] == '-' && !visit[x][moveY]){
                visit[x][moveY] = true;
                moveY++;
            }
        }

        // 세로일때
        if(type == '|'){
            // 아래로 이동
            int moveX = x + 1;
            while(moveX < n && graph[moveX][y] == '|' && !visit[moveX][y]){
                visit[moveX][y] = true;
                moveX++;
            }
        }
    }
}