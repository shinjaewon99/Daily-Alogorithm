import java.util.*;

class Main {
    private static int n; // 돌 개수
    private static int s; // 출발점
    private static int[] numbers;
    private static boolean[] visit;
    private static int result;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt(); 
        numbers = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            numbers[i] = in.nextInt();
        }

        s = in.nextInt();
        visit = new boolean[n + 1];
        result = 0;

        dfs(s);

        System.out.println(result);
    }

    private static void dfs(int start) {
        if (visit[start]) return; // 이미 방문한 경우 종료

        visit[start] = true;
        result++; // 방문한 돌 개수 증가

        int ahead = start - numbers[start];
        int back = start + numbers[start];

        // 왼쪽 이동
        if (ahead >= 1 && !visit[ahead]) {
            dfs(ahead);
        }

        // 오른쪽 이동
        if (back <= n && !visit[back]) {
            dfs(back);
        }
    }
}
