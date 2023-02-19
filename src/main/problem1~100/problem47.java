

/*문제
예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다.

크로아티아 알파벳	변경
č	c=
ć	c-
dž	dz=
đ	d-
lj	lj
nj	nj
š	s=
ž	z=
예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.

dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.

입력
첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.

단어는 크로아티아 알파벳으로 이루어져 있다. 문제 설명의 표에 나와있는 알파벳은 변경된 형태로 입력된다.

출력
입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.

예제 입력 1
ljes=njak
예제 출력 1
6
예제 입력 2
ddz=z=
예제 출력 2
3
예제 입력 3
nljj
예제 출력 3
3
예제 입력 4
c=c=
예제 출력 4
2
예제 입력 5
dz=ak
예제 출력 5
3
*/

/**
 * if (i <= inputString.length() - 1) {}을 조건문 마다 해준이유는
 * aedzdz=ls=c 값이 입력되었을경우 문자열의 끝인 'c'는 조건문에 빨려들어감으로, index예외가 반환된다.
 * 그럼으로 inputString.length() - 1 보다 작은 index부터 시작하여한다 (charAt 은 기본값이 index 반환)
 */

import java.util.Scanner;

public class problem47 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String inputString = in.nextLine();
        int count = 0;

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);

            // 만약 char가 'c' 라면
            if (ch == 'c') {
                if (i < inputString.length() - 1) {
                    if (inputString.charAt(i + 1) == '=') {

                        // "c=" 문자를 한개의 문자로 보기떄문에 i++를해줘야된다.
                        i++;
                    } else if (inputString.charAt(i + 1) == '-') {
                        // "c-"도 마찬가지이다.
                        i++;
                    }
                }
            } else if (ch == 'd') {
                if (i < inputString.length() - 1) {
                    if (inputString.charAt(i + 1) == 'z') {
                        if (i < inputString.length() - 2) {
                            // "dz="를 한문자로 보는경우
                            if (inputString.charAt(i + 2) == '=') {
                                i += 2;
                            }
                        }
                    }
                    // "d-"일경우
                    else if (inputString.charAt(i + 1) == '-') {
                        i++;
                    }

                }
            }
            // "lj" 일경우
            else if (ch == 'l') {
                if (i < inputString.length() - 1) {
                    if (inputString.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            }
            // "nj" 일경우
            else if (ch == 'n') {
                if (i < inputString.length() - 1) {
                    if (inputString.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            }
            // "s=" 일경우
            else if (ch == 's') {
                if (i < inputString.length() - 1) {
                    if (inputString.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            }
            // "z=" 일경우
            else if (ch == 'z') {
                if (i < inputString.length() - 1) {
                    if (inputString.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            }


            count++;
        }
        System.out.println(count);
    }
}
