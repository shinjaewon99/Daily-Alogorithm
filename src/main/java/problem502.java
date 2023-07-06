/*
문제
정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.

입력
첫째 줄에 정수 N (1 ≤ N ≤ 10,000,000)이 주어진다.

출력
N의 소인수분해 결과를 한 줄에 하나씩 오름차순으로 출력한다. N이 1인 경우 아무것도 출력하지 않는다.

예제 입력 1
72
예제 출력 1
2
2
2
3
3
예제 입력 2
3
예제 출력 2
3
예제 입력 3
6
예제 출력 3
2
3
예제 입력 4
2
예제 출력 4
2
예제 입력 5
9991
예제 출력 5
97
103
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problem502 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= number; i++) {

            // number의 i 모듈 한 나머지가 계속 0이면 누적
            while (number % i == 0) {
                list.add(i);

                number /= i;
            }
        }

        for (int result : list) {
            System.out.println(result);
        }
    }
}
