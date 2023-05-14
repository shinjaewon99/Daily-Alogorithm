/*
문제
정수 X가 주어진다. 정수 X는 항상 8진수, 10진수, 16진수 중에 하나이다.

8진수인 경우에는 수의 앞에 0이 주어지고, 16진수인 경우에는 0x가 주어진다.

X를 10진수로 바꿔서 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 X가 주어진다. X는 10진수로 바꿨을 때, 1,000,000보다 작거나 같은 자연수이다. 16진수인 경우 알파벳은 소문자로만 이루어져 있다.

출력
첫째 줄에 입력받은 X를 10진수로 바꿔서 출력한다.

예제 입력 1
10
예제 출력 1
10
예제 입력 2
010
예제 출력 2
8
예제 입력 3
0x10
예제 출력 3
16
예제 입력 4
0x3f6
예제 출력 4
1014
*/
import java.util.Scanner;

public class problem333 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String n = "";
        int N8; // 8진수 값을 담을 변수
        int N16; // 16진수 값을 담을 변수

        // 첫번째 자리가 0으로 시작하는지 확인
        if (str.charAt(0) == '0') {
            // 두번째 자리가 x인 경우
            if (str.charAt(1) == 'x') {
                for (int i = 2; i < str.length(); i++) {
                    n += str.charAt(i); // 문자를 누적하여 더해준다.
                }
                N16 = Integer.valueOf(n, 16); // 16진수로 변환
                System.out.println(N16);
            }

            // 두번째 자리가 x가 아닐 경우
            else {
                for (int i = 1; i < str.length(); i++) {
                    n += str.charAt(i);
                }
                N8 = Integer.valueOf(n, 8);
                System.out.println(N8);
            }
        }
        // 10진수
        else {
            System.out.println(str);
        }
    }
}

