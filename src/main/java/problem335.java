/*
문제
두 정수 A와 B가 주어졌을 때, 두 정수 사이에 있는 수의 합을 구하는 프로그램을 작성하시오. 사이에 있는 수들은 A와 B도 포함한다.

입력
첫째 줄에 두 정수 A, B가 주어진다. (-2,147,483,648 ≤ A, B ≤ 2,147,483,647)

출력
첫째 줄에 답을 출력한다. (-2,147,483,648 ≤ 답 ≤ 2,147,483,647)

예제 입력 1
1 2
예제 출력 1
3
*/
import java.util.Scanner;

public class problem335 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();

        if (a > b) { // a가 b보다 클 경우, 두 값을 스왑합니다.
            long temp = a;
            a = b;
            b = temp;
        }

        // 1 3 -> 6
        // 등차수열 합 공식을 이용하여 합을 계산합니다.
        long sum = (a + b) * (b - a + 1) / 2;

        System.out.println(sum);
    }
}

