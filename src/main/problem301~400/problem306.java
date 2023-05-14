/*
문제
N보다 작거나 같은 자연수 중에서, 집합 K의 원소로만 구성된 가장 큰 수를 출력하는 프로그램을 작성하시오. K의 모든 원소는 1부터 9까지의 자연수로만 구성된다.

예를 들어 N=657이고, K={1, 5, 7}일 때 답은 577이다.

입력
첫째 줄에 N, K의 원소의 개수가 공백을 기준으로 구분되어 자연수로 주어진다. (10 ≤ N ≤ 100,000,000, 1 ≤ K의 원소의 개수 ≤ 3) 둘째 줄에 K의 원소들이 공백을 기준으로 구분되어 주어진다. 각 원소는 1부터 9까지의 자연수다.

단, 항상 K의 원소로만 구성된 N보다 작거나 같은 자연수를 만들 수 있는 경우만 입력으로 주어진다.

출력
첫째 줄에 N보다 작거나 같은 자연수 중에서, K의 원소로만 구성된 가장 큰 수를 출력한다.

예제 입력 1
657 3
1 5 7
예제 출력 1
577
*/
import java.util.Arrays;
import java.util.Scanner;

public class problem306 {
    static int n;
    static int m;
    static int[] arr;
    static int result;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        n = in.nextInt(); // 자연수
        m = in.nextInt(); // 집합 원소의 갯수
        arr = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        dfs(0);
        System.out.print(result);
    }

    private static void dfs(int number) {

        // 탈출조건
        if (number > n) return;

        if (result < number) result = number; // result값 갱신

        // 큰 값부터 꺼낸다.
        for (int i = m - 1; i >= 0; i--) {
            dfs(number * 10 + arr[i]);
        }
    }
}
