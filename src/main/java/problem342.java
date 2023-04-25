/*
문제
주어진 N개의 정수가 비내림차순으로 나열되어 있는지 판정하는 프로그램을 작성하시오. N개의 수 A1, A2, ..., AN이 A1 ≤ A2 ≤ ... ≤ AN 을 만족하는 것을 비내림차순이라고 한다.

입력
첫째 줄에 공백으로 구분된 N(1 ≤ N ≤ 1,000,000)개의 정수가 주어진다. 입력으로 주어지는 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

출력
비내림차순으로 나열되어 있으면 Good을 출력하고, 그렇지 않으면 Bad을 출력한다.

예제 입력 1
7
예제 출력 1
Good
예제 입력 2
1 2 3 4 5
예제 출력 2
Good
예제 입력 3
1 2 2 2 4
예제 출력 3
Good
예제 입력 4
2 1
예제 출력 4
Bad
예제 입력 5
1 2 3 2 1
예제 출력 5
Bad
*/

import java.util.Scanner;

public class problem342 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String result = "Good";
        String[] input = in.nextLine().split(" ");
        for (int i = 0; i < input.length - 1; i++) {
            int firstNumber = Integer.parseInt(input[i]);
            int secondNumber = Integer.parseInt(input[i + 1]);

            // 앞에있는 숫자가 뒤에있는 숫자보다 큰 경우
            if(firstNumber > secondNumber){
                result = "Bad";
                break;
            }
        }

        System.out.println(result);
    }
}
