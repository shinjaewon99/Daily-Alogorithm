/*문제
타로는 자주 JOI잡화점에서 물건을 산다. JOI잡화점에는 잔돈으로 500엔, 100엔, 50엔, 10엔, 5엔, 1엔이 충분히 있고, 언제나 거스름돈 개수가 가장 적게 잔돈을 준다. 타로가 JOI잡화점에서 물건을 사고 카운터에서 1000엔 지폐를 한장 냈을 때, 받을 잔돈에 포함된 잔돈의 개수를 구하는 프로그램을 작성하시오.

입력
입력은 한줄로 이루어져있고, 타로가 지불할 돈(1 이상 1000미만의 정수) 1개가 쓰여져있다.

출력
제출할 출력 파일은 1행으로만 되어 있다. 잔돈에 포함된 매수를 출력하시오.

예제 입력 1
380
예제 출력 1
4
예제 입력 2
1
예제 출력 2
15
*/

import java.util.Scanner;

public class problem73 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int[] arr = {500, 100, 50, 10, 5, 1};
        int price = 1000 - a;

        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            // 잔돈이 arr 배열보다 클경우 로직을 통해 갯수를 더해준다.
            if (arr[i] <= price) {
                count += price / arr[i];
                price %= arr[i];

            }
        }
        System.out.println(count);

    }

}


