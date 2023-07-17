import java.util.Scanner;

public class Main {
    private static int com;
    private static int connect;
    private static int[][] graph;
    private static boolean[] flag;
    private static int count = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        com = in.nextInt(); // 컴퓨터 갯수
        connect = in.nextInt(); // 네트워크상 연결된 컴퓨터 쌍의 수
        graph = new int[com + 1][com + 1]; // 노드가 1부터 시작하므로 맞춰서 배열 생성
        flag = new boolean[com + 1];

        for (int i = 1; i <= connect; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            graph[x][y] = graph[y][x] = 1; // 연결된 네트워크 1로 할당
        }

        dfs(1); // 1번 노드부터 시작한다.
        System.out.println(count);
    }

    private static void dfs(int num){
        flag[num] = true;

        for (int i = 1; i <= com; i++) {
            // 방문하지않고, 컴퓨터끼리 연결되어있는지 확인
            if (!flag[i] && (graph[num][i] == 1)) {
                dfs(i);
                count++;
            }
        }
    }
}
