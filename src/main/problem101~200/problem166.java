/*
문제
모든 값이 0으로 채워져 있는 길이가 N인 배열 A가 있다. 영선이는 다음과 같은 두 연산을 수행할 수 있다.

배열에 있는 값 하나를 1 증가시킨다.
배열에 있는 모든 값을 두 배 시킨다.
배열 B가 주어졌을 때, 배열 A를 B로 만들기 위한 연산의 최소 횟수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 배열의 크기 N이 주어진다. (1 ≤ N ≤ 50)

둘째 줄에는 배열 B에 들어있는 원소가 공백으로 구분해서 주어진다. 배열에 B에 들어있는 값은 0보다 크거나 같고, 1,000보다 작거나 같다.

출력
첫째 줄에 배열 A를 B로 바꾸기 위한 최소 연산 횟수를 출력한다.

예제 입력 1
2
2 1
예제 출력 1
3
예제 입력 2
3
16 16 16
예제 출력 2
7
예제 입력 3
1
100
예제 출력 3
9
예제 입력 4
5
0 0 1 0 1
예제 출력 4
2
*/
import java.util.Scanner;

public class problem166 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        int result = 0;
        for (int i = 0; i < size; i++) {
            String n = in.next();
            String m = in.next();

            int one = 0;
            int zero = 0;
            for (int j = 0; j < n.length(); j++) {
                // n 문자열과, m 문자열을 비교한다.
                if (n.charAt(j) != m.charAt(j)) {
                    if (n.charAt(j) == '1') {
                        one++;
                    } else {
                        zero++;
                    }
                }
            }
            result = Math.max(one, zero);

            System.out.println(result);
        }

    }
}
