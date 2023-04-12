/*
문제
그릇을 바닥에 놓았을 때 그 높이는 10cm 이다. 그런데 두 개의 그릇을 같은 방향으로 포개면 그 높이는 5cm만 증가된다. 만일 그릇이 서로 반대방향으로 쌓이면 높이는 그릇만큼, 즉 10cm 늘어난다. 그릇을 괄호 기호로 나타내어 설명해보자. 편의상 그릇이 쌓여지는 방향은 왼쪽에서 오른쪽이라고 가정한다. 그림에서 ‘(’은 그릇이 바닥에 바로 놓인 상태를 나타내며, ‘)’은 그릇이 거꾸로 놓인 상태를 나타낸다.

만일 그릇이 포개진 모양이 ((((와 같다면 전체의 높이는 25cm가 된다. 왜냐하면 처음 바닥에 있는 그릇의 높이가 10cm이고 이후 같은 방향으로 3개의 그릇이 포개져 있으므로 늘어난 높이는 5+5+5=15 이기 때문이다. ()()와 같은 경우라면 그 높이는 10*4=40cm가 된다.

여러분은 입력에 주어진 모양대로 그릇을 쌓을 때 최종의 전체 그릇 높이를 계산해서 출력해야 한다. 즉 처음 입력으로 주어진 각 그릇의 방향은 바꿀 수 없다.

입력
첫 줄에는 괄호문자로만 이루어진 문자열이 주어진다. 입력 문자열에서 열린 괄호 ‘(’은 바로 놓인 그릇, 닫힌 괄호 ‘)’은 거꾸로 놓인 그릇을 나타난다. 문자열의 길이는 3이상 50 이하이다.

출력
여러분은 그릇 방향이 괄호 문자로 표시된 문자열을 읽어서 그 최종의 높이를 정수로 출력해야 한다.

예제 입력 1
((((
예제 출력 1
25
예제 입력 2
()()()))(
예제 출력 2
80
*/
import java.util.Scanner;
import java.util.Stack;

public class problem256 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] s = in.next().split("");
        Stack<String> st = new Stack<>();

        int result = 0;

        for (String str : s) {
            if (st.isEmpty()) {
                st.add(str);
                result += 10; // 초기 높이
            } else {
                if (st.peek().equals(str)) {
                    // st 스택의 맨 위의 값이 입력된 문자랑 같을경우
                    result += 5;
                } else {
                    result += 10;
                }
                st.add(str);
            }
        }
        System.out.print(result);

    }
}

