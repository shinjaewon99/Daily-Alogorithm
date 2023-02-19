/*문제
슈퍼 마리오 앞에 10개의 버섯이 일렬로 놓여져 있다. 이 버섯을 먹으면 점수를 받는다.

슈퍼 마리오는 버섯을 처음부터 나온 순서대로 집으려고 한다. 하지만, 모든 버섯을 집을 필요는 없고 중간에 중단할 수 있다. 중간에 버섯을 먹는 것을 중단했다면, 그 이후에 나온 버섯은 모두 먹을 수 없다. 따라서 첫 버섯을 먹지 않았다면, 그 이후 버섯도 모두 먹을 수 없다.

마리오는 받은 점수의 합을 최대한 100에 가깝게 만들려고 한다.

버섯의 점수가 주어졌을 때, 마리오가 받는 점수를 출력하는 프로그램을 작성하시오.

입력
총 10개의 줄에 각각의 버섯의 점수가 주어진다. 이 값은 100보다 작거나 같은 양의 정수이다. 버섯이 나온 순서대로 점수가 주어진다.

출력
첫째 줄에 마리오가 받는 점수를 출력한다. 만약 100에 가까운 수가 2개라면 (예: 98, 102) 마리오는 큰 값을 선택한다.

예제 입력 1
10
20
30
40
50
60
70
80
90
100
예제 출력 1
100
예제 입력 2
1
2
3
5
8
13
21
34
55
89
예제 출력 2
87
예제 입력 3
40
40
40
40
40
40
40
40
40
40
예제 출력 3
120
*/

import java.util.Scanner;

public class problem41 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[10];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }


        int max = 0;
        int temp = 100;
        for (int i = 0; i < array.length; i++) {
            count += array[i];

            // 버섯을 먹는거를 멈추는게 아니라 10개 다먹는다고 시나리오를 잡는다.
            // Math.abs() 절대값
            if (Math.abs(100 - count) <= temp) {
                temp = Math.abs(100 - count);
                max = count;
            }

        }
        System.out.println(max);
    }
}