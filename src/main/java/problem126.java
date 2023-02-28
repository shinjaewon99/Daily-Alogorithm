/*
1이 될 때까지
문제
어떠한 수 N이 1이 될 때 까지 다음의 두 과정 중 하나를 반복적으로 선택해 수행하려 함

단, 두번째 연산은 N이 K로 나누어 떨어질 때만 선택할 수 있음

N에서 1을 뺀다.

N을 K로 나눈다.

N이 1이 될 때 까지 1번 혹은 2번의 과정을 수행해야하는 최소 횟수를 구하는 프로그램을 작성

입력
첫째 줄에 N(2<= N <= 100000)과 K(2 <= K <= 100000)가 공백으로 구분되며 각각 자연수로 주어짐

이때, 입력으로 주어지는 N은 항상 K보다 크거나 같음

출력
첫째 줄에 N이 1이 될 때까지 1번 혹은 2번의 과정을 수행해야 하는 횟수의 최솟값을 출력

입력 예시
3 3
3 1 2
4 1 4
2 2 2

출력 예시
2

*/

import java.util.Scanner;

public class problem126 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        int count = 0;
        while(n != 1) {
            if (n % k != 0) {
                n -= 1;
            }else{
                n /= k;
            }
            count++;
        }
        System.out.print(count);
    }
}

