import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private static int n, m;
    private static ArrayList<Integer>[] list;
    private static boolean[] flag;
    private static int countArr[];
    private static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());

        n = Integer.parseInt(st.nextToken()); // N개 입력
        m = Integer.parseInt(st.nextToken()); // 입력 갯수
        countArr = new int[n + 1];
        list = new ArrayList[n + 1];

        // 새로운 list 객체를 n 개 까지 생성
        for (int i = 0; i < n + 1; i++) {
            list[i] = new ArrayList<Integer>();
        }

        // 신뢰하는 관계 입력
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(in.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // A가 B를 신뢰한다. = a는 b에게 해킹을 당할수 있음
            list[a].add(b);
        }

        for (int i = 1; i <= n; i++) {
            flag = new boolean[n + 1]; // 연결된 노드를 확인하기 위한 flag
            dfs(i);
        }
        for (int i = 1; i <= n; i++) {
            max = Math.max(max, countArr[i]);
        }

        StringBuilder output = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (max == countArr[i]) output.append(i).append(" ");
        }
        System.out.println(output.toString());
    }

    private static void dfs(int num) {
        flag[num] = true;
        for (int find : list[num]) {
            if (flag[find]) continue;
            countArr[find]++;
            dfs(find);
        }
    }
//
//    private static void bfs(int num) {
//        Queue<Integer> queue = new ArrayDeque<>();
//        queue.add(num);
//        flag[num] = true;
//
//        while (!queue.isEmpty()) {
//            int poll = queue.poll();
//            for (int find : list[poll]) {
//                if (flag[find]) {
//                    continue;
//                }
//                countArr[find]++;
//                queue.add(find);
//                flag[find] = true;
//            }
//        }
//    }
}
