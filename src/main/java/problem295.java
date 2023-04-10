/*
문제
당신은 N개의 반지를 가지고 있다. 각각의 반지는 대문자 10 문자로 이루어진 문자열이 새겨져 있다. 반지는 문자열의 시작과 끝이 연결된 형태로 문자가 새겨져 있다. 반지에 각인된 문자열을 거꾸로 읽는 걱정은 없다.

찾고자하는 문자열이 주어졌을 때 그 문자열을 포함하는 반지가 몇 개인지를 발견하는 프로그램을 작성하라.

입력
입력은 총 2 + N 줄 이다.

첫 번째 줄에는 1 자 이상 10 자 이하의 대문자로 구성된 찾고자 하는 문자열이 적혀있다.

두 번째 줄에는 반지의 개수 N (1 ≦ N ≦ 100)이 적혀있다.

2+i 줄(1 ≦ i ≦ N)엔 i개의 반지에 새겨져있고, 10 문자로 이루어진 문자열이 적혀있다.

출력
찾고자하는 문자열을 포함 반지의 개수를 나타내는 정수를 한 줄로 출력하라.

예제 입력 1
ABCD
3
ABCDXXXXXX
YYYYABCDXX
DCBAZZZZZZ
예제 출력 1
2
예제 입력 2
XYZ
1
ZAAAAAAAXY
예제 출력 2
1
예제 입력 3
PQR
3
PQRAAAAPQR
BBPQRBBBBB
CCCCCCCCCC
예제 출력 3
2
힌트
<예제 입력 2>의 반지에는 "XYZ"라는 문자열이 하나 포함되어있다. 이것은 반지의 문자열의 시작과 끝이 연결되어 있기 때문이다.

<예제 입력 3>의 첫 번째 반지는 "PQR"이라는 단어가 2 개 포함되어 있으며, 두 번째 반지는 "PQR"라는 문자열이 1 개 포함되어 있으며, 세 번째 반지에는 "PQR"라는 문자열이 포함되어 있지 않다. 따라서 "PQR"라는 문자열이 포함되어있는 반지의 수는 2 개가 된다.
*/
import java.util.Scanner;

public class problem295 {

    public static void main(String[] args) {

        // 간단한 문자열 문제다.
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int t = in.nextInt();
        int result = 0;
        for (int i = 0; i < t; i++) {
            String s = in.next();
            s += s;
            // .contains : 문자열의 포함되어있는지 확인
            if (s.contains(str)) {
                result++;
            }
        }
        System.out.print(result);
    }
}

