/*
문제
신원이는 백준에서 배수에 관한 문제를 풀다가 감명을 받아 새로운 문제를 만들어보았다. 자연수 N과 M개의 자연수 Ki가 주어진다. Ki중 적어도 하나의 배수이면서 1 이상 N 이하인 수의 합을 구하여라.

입력
첫 번째 줄에 N과 M가 주어진다. (2 ≤ N ≤ 1000, 1 ≤ M < N)

그다음 줄에 M개의 정수 Ki가 주어진다. (2 ≤ Ki ≤ 1000)

동일한 Ki는 주어지지 않으며, 오름차순으로 정렬되어있다.

출력
배수들의 합을 출력한다.

예제 입력 1
10 2
2 3
예제 출력 1
42
예제 입력 2
1000 3
3 5 7
예제 출력 2
272066
*/
import java.util.Scanner;

public class problem343 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number1 = in.nextInt();
        int number2 = in.nextInt();

        int[] numArr = new int[number2];
        for (int i = 0; i < number2; i++) {
            numArr[i] = in.nextInt(); // number2의 크기만큼 값을 입력받는다.
        }

        int result = 0;
        for (int i = 1; i <= number1; i++) {

            // numArr을 순회하며 배수값을 찾는다.
            for (int j = 0; j < number2; j++) {
                if (i % numArr[j] == 0) {
                    result += i;
                    break; // 중복 제거를 위한 break
                }
            }
        }
        System.out.println(result);
    }
}