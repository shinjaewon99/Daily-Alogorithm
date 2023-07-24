import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static int n;
    private static int[] graph;
    private static boolean[] flag;
    private static ArrayList<Integer>[] list;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 노드의 갯수
        n = in.nextInt();
        graph = new int[n + 1]; // 노드 번호가 1번부터 시작함으로
        flag = new boolean[n + 1];
        list = new ArrayList[n + 1]; // list 객체를 n + 1 개 생성

        // 새로운 list 객체 생성 주입
        for (int i = 1; i <= n; i++) {
            list[i] = new ArrayList<>();
        }


        for (int i = 1; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();

            // 같은 줄에 있는 노드 값 list에 저장
            list[x].add(y);
            list[y].add(x);
        }
        // 문제에서 1번 노드는 최상위 부모 노드, 1번 부터 시작
        dfs(1);

        for (int i = 2; i <= n; i++) {
            System.out.println(graph[i]);
        }
    }

    private static void dfs(int num) {
        flag[num] = true; // 방문 체크

        for (int find : list[num]) {
            if (!flag[find]) {
                graph[find] = num;
                dfs(find);
            }
        }
    }
}
