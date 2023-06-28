/*
문제
0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 정수 N(0 ≤ N ≤ 20)이 주어진다.

출력
첫째 줄에 N!을 출력한다.

예제 입력 1
10
예제 출력 1
3628800
예제 입력 2
0
예제 출력 2
1
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem491 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(in.readLine());

        System.out.println(fac(size));

    }

    private static long fac(int number) {
        if (number == 0) {
            return 1;
        } else {
            // 재귀 호출
            return number * fac(number - 1);
        }
    }
}
