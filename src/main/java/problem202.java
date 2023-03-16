/*
문제
세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)

출력
두 번째로 큰 정수를 출력한다.

예제 입력 1
20 30 10
예제 출력 1
20
예제 입력 2
30 30 10
예제 출력 2
30
예제 입력 3
40 40 40
예제 출력 3
40
예제 입력 4
20 10 10
예제 출력 4
10
*/

import java.util.Arrays;
import java.util.Scanner;

public class problem202 {
    public static void main(String[] args) {
        // 간단한 문제다.
        Scanner in = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);

        System.out.print(arr[1]);


    }
}