/*
문제
다섯 개의 자연수가 있다. 이 수의 적어도 대부분의 배수는 위의 수 중 적어도 세 개로 나누어 지는 가장 작은 자연수이다.

서로 다른 다섯 개의 자연수가 주어질 때, 적어도 대부분의 배수를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 다섯 개의 자연수가 주어진다. 100보다 작거나 같은 자연수이고, 서로 다른 수이다.

출력
첫째 줄에 적어도 대부분의 배수를 출력한다.

예제 입력 1
30 42 70 35 90
예제 출력 1
210
예제 입력 2
1 2 3 4 5
예제 출력 2
4
예제 입력 3
30 45 23 26 56
예제 출력 3
1170
예제 입력 4
3 14 15 92 65
예제 출력 4
195
*/

import java.util.Scanner;

public class problem31 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] array = new int[5];
        int div = 1;
        int count = 0; // 3개 이상의 수로 나누어 질경우를 검증

        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        while (true) {
            for (int i = 0; i < array.length; i++) {
                // div를 증가시켜 배열의 수로 나누어지는지 검증
                if (div % array[i] == 0) {
                    count++;
                }
            }
            if (count >= 3) {
                break;
            }
            // 초기화를 해주지 않으면 div = 1에서 다 걸려들어간다.
            count = 0;
            div++;
        }
        System.out.println(div);
        in.close();
    }
}
