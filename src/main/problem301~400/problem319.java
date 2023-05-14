/*
문제
싱기한 네자리 숫자란, [1000,9999]인 10진수 숫자중에서,  다음의 조건을 만족하는 숫자를 말한다.

숫자를 10진수, 12진수, 16진수로 나타낸 다음, 각각의 숫자에 대해, 각 숫자의 자리수를 더했을 때, 세 값이 모두 같아야 한다.
여러분은 싱기한 네자리 숫자를 모두 출력해야 한다.

입력
입력은 주어지지 않는다.

출력
싱기한 네자리 숫자를 오름차순으로 한줄에 하나씩 출력한다.

예제 입력 1
예제 출력 1
2992
2993
2994
2995
2996
2997
2998
2999
힌트
싱기한 네자리 숫자의 첫 번째 수는 2992이다.
*/
import java.util.Scanner;

public class problem319 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int i = 2992; i <= 9999; i++) {
            int temp = i;
            int a = 0; // 10진수의 누적합 변수
            int b = 0; // 12진수의 누적합 변수
            int c = 0; // 16진수의 누적합 변수

            while (temp > 0) {
                a += temp % 10;
                temp /= 10;
            }
            temp = i; // i로 다시 초기화

            while (temp > 0) {
                b += temp % 12;
                temp /= 12;
            }
            temp = i; // i로 다시 초기화
            while (temp > 0) {
                c += temp % 16;
                temp /= 16;
            }
            if (a == b && b == c) {
                System.out.println(i);
            }
        }
    }
}

