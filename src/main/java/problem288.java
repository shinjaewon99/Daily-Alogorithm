/*
문제
상도시의 차량 번호판 형식이 주어졌을 때, 가능한 차량 번호판의 개수를 구해보자.

번호판에 사용할 수 있는 숫자는 0, 1, 2, ..., 8, 9이다.
사용할 수 있는 문자는 a, b, c, d, ..., y, z이다.
차량 번호판의 형식은 최대 4글자이고, c와 d로 이루어진 문자열로 나타낼 수 있다.
c는 문자가 위치하는 자리, d는 숫자가 위치하는 자리이다.
같은 문자 또는 숫자가 연속해서 2번 나타나면 안 된다.
예를 들어, 형식이 "cd"이면, a1, d4, h5, k4 등이 가능하다. 형식이 "dd"인 경우에 01, 10, 34, 69는 가능하지만, 00, 11, 55, 66은 같은 숫자가 2번 연속해서 불가능하다.

입력
첫째 줄에 차량 번호판의 형식이 주어진다. 형식은 길이가 4보다 작거나 같으며, c와 d로만 이루어져 있다.

출력
첫째 줄에 가능한 차량 번호판의 개수를 출력한다.

예제 입력 1
dd
예제 출력 1
90
00부터 99까지 총 100가지 중에서 00, 11, 22, 33, 44, 55, 66, 77, 88, 99가 불가능하다.

예제 입력 2
cc
예제 출력 2
650
262 = 676가지 중에서 같은 문자가 중복되는 26가지가 불가능하다.

예제 입력 3
dcdd
예제 출력 3
23400
*/

import java.util.Scanner;

public class problem288 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        char[] ch = in.next().toCharArray();
        int result = 1;
        for (int i = 0; i < ch.length; i++) {

            // 첫번째 문자인 경우
            if (i == 0) {
                if (ch[i] == 'c') {
                    result *= 26;
                } else {
                    result *= 10;
                }
            } else {
                if (ch[i] == ch[i - 1]) {
                    if (ch[i] == 'c') {
                        result *= 25; // 한개의 문자를 동시에 사용하면 안돼서, 26 - 1
                    } else {
                        result *= 9;
                    }
                } else {
                    if (ch[i] == 'c') {
                        result *= 26;
                    } else {
                        result *= 10;
                    }
                }
            }
        }
        System.out.print(result);
    }
}
