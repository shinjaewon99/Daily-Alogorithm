/*
문제
정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.

X가 3으로 나누어 떨어지면, 3으로 나눈다.
X가 2로 나누어 떨어지면, 2로 나눈다.
1을 뺀다.
정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.

입력
첫째 줄에 1보다 크거나 같고, 106보다 작거나 같은 정수 N이 주어진다.

출력
첫째 줄에 연산을 하는 횟수의 최솟값을 출력한다.

예제 입력 1
2
예제 출력 1
1
예제 입력 2
10
예제 출력 2
3
힌트
10의 경우에 10 → 9 → 3 → 1 로 3번 만에 만들 수 있다.
*/
import java.util.Scanner;

public class problem475 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        // dp 문제에서는 배열을 한개 더 크게만든다.
        int[] dp = new int[num + 1];


        // dp에서는 초기값 초기화가 중요
        dp[1] = 0;


        // 입력값이 3일 경우, 1을 빼면 연산횟수 2회 3을 나누면 1회
        for (int i = 2; i <= num; i++) {
            dp[i] = dp[i - 1] + 1;

            if (i % 2 == 0) dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            if (i % 3 == 0) dp[i] = Math.min(dp[i], dp[i / 3] + 1);
        }

        System.out.println(dp[num]);
    }
}

