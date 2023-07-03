/*
문제
꿍은 군대에서 진짜 할짓이 없다. 그래서 꿍만의 피보나치를 만들어보려고 한다. 기존의 피보나치는 너무 단순해서 꿍은 좀더 복잡한 피보나치를 만들어보고자 한다. 그래서 다음과 같은 피보나치를 만들었다. 꿍만의 피보나치 함수가 koong(n)이라고 할 때,

n < 2 :                         1
n = 2 :                         2
n = 3 :                         4
n > 3 : koong(n − 1) + koong(n − 2) + koong(n − 3) + koong(n − 4)
이다.

여러분도 꿍 피보나치를 구해보아라.

입력
입력의 첫 번째 줄을 테스트 케이스의 개수 t (0 < t < 69)가 주어진다. 다음 t줄에는 몇 번째 피보나치를 구해야하는지를 나타내는 n(0 ≤ n ≤ 67)이 주어진다.

출력
각 테스트 케이스에 대해, 각 줄에 꿍 피보나치값을 출력하라.

예제 입력 1
8
0
1
2
3
4
5
30
67
예제 출력 1
1
1
2
4
8
15
201061985
7057305768232953720
*/
import java.util.Scanner;

public class problem486 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        for (int i = 0; i < size; i++) {
            int input = in.nextInt();
            System.out.println(fibo(input));
        }

    }

    private static long fibo(int n) {
        if (n < 2) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else if (n == 3) {
            return 4;
        }

        // dp 배열 생성
        long[] koong = new long[n + 1];
        koong[0] = 1;
        koong[1] = 1;
        koong[2] = 2;
        koong[3] = 4;

        for (int i = 4; i <= n; i++) {
            koong[i] = koong[i - 4] + koong[i - 3] + koong[i - 2] + koong[i -1];
        }
        // 해당 배열 반환
        return koong[n];
    }
}
