/*
문제
"The quick brown fox jumped over the lazy dogs."

이 문장은 모든 알파벳이 적어도 한 번은 나오는 문장으로 유명하다. 즉 26개의 서로 다른 문자를 갖고 있는 것이다.

각 케이스마다 문장에서 공백, 숫자, 특수 문자를 제외하고 얼마나 다양한 알파벳이 나왔는지를 구하면 된다. 대소문자는 하나의 문자로 처리한다. ex) 'A' == 'a'

입력
입력은 250자를 넘지 않는 문장이 주어진다.

각 문장은 적어도 하나의 공백이 아닌 문자를 포함한다. (알파벳이 아닐 수 있다)

마지막 줄에는 '#'이 주어진다.

출력
각 줄마다 출몰한 알파벳의 개수를 출력하면 된다.

예제 입력 1
The quick brown fox jumped over the lazy dogs.
2 + 2 = 4
New Zealand Programming Contest.
#
예제 출력 1
26
0
16
*/
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class problem320 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            String str = in.nextLine();
            // 탈출 조건
            if (str.equals("#")) {
                break;
            }

            // 문자 중복 제거를 위한 set 객체
            Set<Character> set = new HashSet<>();

            for (char c : str.toCharArray()) {
                // isLetter : c가 문자 인지 확인
                if (Character.isLetter(c)) {
                    set.add(Character.toLowerCase(c));
                }
            }
            System.out.println(set.size());
        }
    }
}

