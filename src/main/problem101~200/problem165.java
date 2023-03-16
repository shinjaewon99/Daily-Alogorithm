/*
문제
세준이는 N개의 빨대를 가지고 있다. N개의 빨대 중에 3개의 빨대를 선택했을 때, 이 빨대로 삼각형을 만들 수 있다면, 세 변의 길이의 합의 최댓값을 구하고 싶다.

입력
첫째 줄에 빨대의 개수 N이 주어진다. N은 3보다 크거나 같고, 1,000,000보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에 빨대의 길이가 한 줄에 하나씩 주어진다. 빨대의 길이는 1,000,000보다 작거나 같은 자연수이다.

출력
첫째 줄에 삼각형 세 변의 길이의 합의 최댓값을 출력한다. 만약 삼각형을 만들 수 없으면 -1을 출력한다.

예제 입력 1
3
1
2
3
예제 출력 1
-1
예제 입력 2
3
1
2
2
예제 출력 2
5
예제 입력 3
6
2
3
2
3
2
4
예제 출력 3
10
예제 입력 4
5
4
5
6
7
20
예제 출력 4
18
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class problem165 {
    public static void main(String[] args) throws IOException {

        // 메모리 초과 이슈로 BufferedReader 사용
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(bf.readLine());
        Integer[] arr = new Integer[size];

        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(arr, Comparator.reverseOrder());


        int answer = Integer.MIN_VALUE;
        // size - 2 로 조건을 건 이유는 3개 씩 비교 해야되기 때문.
        for (int j = 0; j < size - 2; j++) {
            if (arr[j] < arr[j + 1] + arr[j + 2]) {
                answer = Math.max(answer, arr[j] + arr[j + 1] + arr[j + 2]);
            }
        }
        if (answer == Integer.MIN_VALUE) {
            System.out.print(-1);
            return;
        }

        System.out.print(answer);


    }
}
