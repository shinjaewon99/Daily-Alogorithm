/*
문제
M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.

출력
한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.

예제 입력 1
3 16
예제 출력 1
3
5
7
11
13
*/

import java.util.Scanner;

public class problem252 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[m + 1];

        for (int i = 2; i <= m; i++) {
            arr[i] = i; // 배열에 1부터 m까지 값을 초기화해준다.
        }

        // 제곱근 까지만 검증
        for (int i = 2; i <= Math.sqrt(m); i++) {
            if (arr[i] == 0) continue;
            // i의 배수를 0으로 바꿔준다.
            for (int j = i + i; j <= m; j += i) {
                arr[j] = 0;
            }
        }

        // 문제에서 n 부터 시작해서 m까지의 소수 갯수
        for (int i = n; i <= m; i++) {
            if (arr[i] != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}