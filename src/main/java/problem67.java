/*문제
문제
배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.

입력
첫째 줄에 정렬하려고 하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.

출력
첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.

예제 입력 1
2143
예제 출력 1
4321
예제 입력 2
999998999
예제 출력 2
999999998
예제 입력 3
61423
예제 출력 3
64321
예제 입력 4
500613009
예제 출력 4
965310000
*/

import java.util.*;

public class problem67 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();
        char [] inputChar = input.toCharArray();

        // 오름차순
        Arrays.sort(inputChar);

        // 오름차순이 된 배열에서 뒷 부분부터 꺼냄으로써 내림차순이 된다.
        for (int i = inputChar.length - 1 ; i >= 0 ; i--) {
            System.out.print(inputChar[i]);
        }

    }
}

