/*
문제
자연수 n개가 주어진다. 이 자연수의 공약수를 모두 구하는 프로그램을 작성하시오.

입력
첫째 줄에 n이 주어진다. n은 2 또는 3이다. 둘째 줄에는 공약수를 구해야 하는 자연수 n개가 주어진다. 모든 자연수는 108 이하이다.

출력
입력으로 주어진 n개 수의 공약수를 한 줄에 하나씩 증가하는 순서대로 출력한다.

예제 입력 1
2
75 125
예제 출력 1
1
5
25
예제 입력 2
3
110 22 88
예제 출력 2
1
2
11
22
예제 입력 3
3
66 11 3
예제 출력 3
1
*/

import java.util.Arrays;
import java.util.Scanner;

public class problem500 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = in.nextInt();
        }
        Arrays.sort(numbers);

        // 최소값인 원소 까지 비교합니다.
        for (int i = 1; i <= numbers[0]; i++) {
            int count = 0;

            for (int j = 0; j < size; j++) {
                if(numbers[j] % i == 0){
                    count++;
                }
            }
            // count 갯수와, size가 같은경우 = 공통의 약수
            if(count == size){
                System.out.println(i);
            }
        }
    }
}

