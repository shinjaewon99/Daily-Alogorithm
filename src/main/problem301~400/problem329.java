/*
문제
자연수 N이 주어진다. N을 이진수로 바꿔서 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 자연수 N이 주어진다. (1 ≤ N ≤ 100,000,000,000,000)

출력
N을 이진수로 바꿔서 출력한다. 이진수는 0으로 시작하면 안 된다.

예제 입력 1
53
예제 출력 1
110101
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class problem329 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long number = in.nextLong();

        List<Long> list = new ArrayList<>();

        while (number > 0) {
            long temp = number % 2;
            number /= 2;

            list.add(temp);
        }
        Collections.reverse(list);

        for (long i : list) {
            System.out.print(i);
        }
    }
}
