/*
문제
꿍은 도비의 자유를 위해 영어를 가르치기로 결심했다. 하지만 도비는 바보라 ABC부터 배워야 한다.

그래서 꿍은 영어 문장과 알파벳 하나가 주어지면 그 알파벳이 문장에서 몇 번 나타나는지를 세는 문제들을 내주었다. 하지만 도비는 마법사고 컴공도 마법사다.

여러분은 도비를 위해 문제의 답을 알려주는 프로그램을 만들수 있을것이다!

입력
입력은 몇 개의 줄들로 이루어진다.

각 줄에는 하나의 소문자와 영어 문장이 공백으로 구분되어 주어진다.

각 문장은 길이가 1에서 250이며 입력의 마지막은 #이다.

출력
출력의 각 줄은 입력으로 주어진 소문자와 그 소문자 알파벳이 나타난 횟수로 이루어진다. 이때 문장에서 해당 알파벳이 소문자로 나타나던 대문자로 나타나던 모두 세야 한다.

예제 입력 1
g Programming Contest
n New Zealand
x This is quite a simple problem.
#
예제 출력 1
g 2
n 2
x 0
*/
import java.util.Scanner;

public class problem336 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            char one = in.next().charAt(0);

            // 탈출 조건
            if (one == '#') {
                break;
            }

            // trim : 문자열 공백 제거
            String str = in.nextLine().trim();
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                // 같은 문자인지 검증
                if (Character.toLowerCase(str.charAt(i))
                        == Character.toLowerCase(one)) {
                    count++;
                }
            }
            // 출력
            System.out.println(one + " " + count);
        }
    }
}