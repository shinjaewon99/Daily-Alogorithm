/*문제
민식이는 다음과 같은 폴리오미노 2개를 무한개만큼 가지고 있다. AAAA와 BB

이제 '.'와 'X'로 이루어진 보드판이 주어졌을 때, 민식이는 겹침없이 'X'를 모두 폴리오미노로 덮으려고 한다. 이때, '.'는 폴리오미노로 덮으면 안 된다.

폴리오미노로 모두 덮은 보드판을 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 보드판이 주어진다. 보드판의 크기는 최대 50이다.

출력
첫째 줄에 사전순으로 가장 앞서는 답을 출력한다. 만약 덮을 수 없으면 -1을 출력한다.

예제 입력 1
XXXXXX
예제 출력 1
AAAABB
예제 입력 2
XX.XX
예제 출력 2
BB.BB
예제 입력 3
XXXX....XXX.....XX
예제 출력 3
-1
예제 입력 4
X
예제 출력 4
-1
예제 입력 5
XX.XXXXXXXXXX..XXXXXXXX...XXXXXX
예제 출력 5
BB.AAAAAAAABB..AAAAAAAA...AAAABB
*/

import java.util.Scanner;

public class problem85 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        String input = in.next();

        String result = "";
        String A = "AAAA";
        String B = "BB" ;

        // "XXXX"인 문자가 입력되면 input에 다시 담아준다.
        input = input.replaceAll("XXXX", A);

        // "AAAA"로 바뀐 문자열에서 다시 검증한다.
        result = input.replaceAll("XX", B);


        if(result.contains("X")) {
            System.out.print("-1");
        }else{
            System.out.print(result);
        }

    }
}

