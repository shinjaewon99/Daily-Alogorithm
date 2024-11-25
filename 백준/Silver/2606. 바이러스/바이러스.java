import java.util.*;

class Main {
    private static int com;
    private static int connect;
    private static int[][] coms;
    private static boolean[] visit;
    private static int count;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        com = in.nextInt();
        connect = in.nextInt();

        coms = new int[com + 1][com + 1];
        visit = new boolean[com + 1];

        for(int i = 1; i <= connect; i++){
            int x = in.nextInt();
            int y = in.nextInt();

            // 양방향으로 연결
            coms[x][y] = 1;
            coms[y][x] = 1;
        }

        dfs(1);
        System.out.println(count);
    }

    private static void dfs(final int number){
        visit[number] = true;

        for(int i = 1; i <= com; i++){
            // coms 배열을 깊이 탐색
            if(!visit[i] && (coms[number][i] == 1)){
                dfs(i);
                count++;
            }
        }
    }
}