/*
문제
10진법 수 N이 주어진다. 이 수를 B진법으로 바꿔 출력하는 프로그램을 작성하시오.

10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.

A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35

입력
첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36) N은 10억보다 작거나 같은 자연수이다.

출력
첫째 줄에 10진법 수 N을 B진법으로 출력한다.

예제 입력 1
60466175 36
예제 출력 1
ZZZZZ
*/

import java.util.Scanner;

public class problem284 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt(); // 몇 진법인지 입력
        StringBuilder sb = new StringBuilder();

        // 65 ~ 90 대문자 아스키코드
        while (n > 0) {
            // 나머지가 10 이상이면 A,B,C 아스키 코드로 표현
            if (n % m >= 10) {
                sb.append((char) ((n % m) + 55));
            } else {
                sb.append(n % m);
            }
            n /= m;
        }

        // 나머지를 append 함으로, reverse() 해줘야된다.
        System.out.print(sb.reverse().toString());
    }
}
