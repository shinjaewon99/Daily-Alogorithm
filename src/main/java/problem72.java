/*
문제
옛날 옛적에 수학이 항상 큰 골칫거리였던 나라가 있었다. 이 나라의 국왕 김지민은 다음과 같은 문제를 내고 큰 상금을 걸었다.

길이가 N인 정수 배열 A와 B가 있다. 다음과 같이 함수 S를 정의하자.

S = A[0] × B[0] + ... + A[N-1] × B[N-1]

S의 값을 가장 작게 만들기 위해 A의 수를 재배열하자. 단, B에 있는 수는 재배열하면 안 된다.

S의 최솟값을 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 N이 주어진다. 둘째 줄에는 A에 있는 N개의 수가 순서대로 주어지고, 셋째 줄에는 B에 있는 수가 순서대로 주어진다. N은 50보다 작거나 같은 자연수이고, A와 B의 각 원소는 100보다 작거나 같은 음이 아닌 정수이다.

출력
첫째 줄에 S의 최솟값을 출력한다.

예제 입력 1
5
1 1 1 6 0
2 7 8 3 1
예제 출력 1
18
예제 입력 2
3
1 1 3
10 30 20
예제 출력 2
80
예제 입력 3
9
5 15 100 31 39 0 0 3 26
11 12 13 2 3 4 5 9 1
예제 출력 3
528
*/

import java.util.Arrays;
import java.util.Scanner;

public class problem72 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int size = in.nextInt();

        int[] a = new int[size];
        int[] b = new int[size];
        for (int j = 0; j < size; j++) {
            a[j] = in.nextInt();
        }
        for (int j = 0; j < size; j++) {
            b[j] = in.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);

        int reverseA[] = new int[a.length];
        int k = 0;
        // 내림차순 정렬
        for (int i = a.length - 1; i >= 0; i--) {
            reverseA[k] = a[i];
            k++;
        }

        int total = 0;
        for (int i = 0; i < size; i++) {
            total += reverseA[i] * b[i];
        }

        System.out.println(total);

    }

}
