import java.util.Scanner;

public class Main {
    private static int n, s, count;
    private static int[] arr;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt(); // 수열의 크기
        s = in.nextInt(); // 목표 합
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        count = 0;
        dfs(0, 0, false); // DFS 탐색 시작

        System.out.println(count);
    }

    static void dfs(int index, int sum, boolean flag) {
        if (index == n) { // 모든 원소를 탐색한 경우
            if (flag && sum == s) { 
                count++;
            }
            return;
        }

        // 현재 원소를 포함하지 않는 경우
        dfs(index + 1, sum, flag);

        // 현재 원소를 포함하는 경우
        dfs(index + 1, sum + arr[index], true);
    }
}
