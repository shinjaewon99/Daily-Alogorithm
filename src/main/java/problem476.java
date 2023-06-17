/*
문제
2×n 크기의 직사각형을 1×2, 2×1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.

아래 그림은 2×5 크기의 직사각형을 채운 한 가지 방법의 예이다.



입력
첫째 줄에 n이 주어진다. (1 ≤ n ≤ 1,000)

출력
첫째 줄에 2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.

예제 입력 1
2
예제 출력 1
2
예제 입력 2
9
예제 출력 2
55
*/
import java.util.Scanner;

public class problem476 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        // dp문제를 풀기위해선 배열 크기 + 1
        int[] dp = new int[num + 1];

        // dp 값 초기화
        dp[1] = 1;
        dp[2] = 2;

        // 1 2 3
        for (int i = 3; i <= num; i++) {
            dp[i] = (dp[i - 2] + dp[i - 1]) % 10007;
        }

        System.out.println(dp[num]);

    }
}

