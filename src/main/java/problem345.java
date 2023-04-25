/*
문제
아래 그림처럼 높이만 다르고 (같은 높이의 막대기가 있을 수 있음) 모양이 같은 막대기를 일렬로 세운 후, 왼쪽부터 차례로 번호를 붙인다. 각 막대기의 높이는 그림에서 보인 것처럼 순서대로 6, 9, 7, 6, 4, 6 이다. 일렬로 세워진 막대기를 오른쪽에서 보면 보이는 막대기가 있고 보이지 않는 막대기가 있다. 즉, 지금 보이는 막대기보다 뒤에 있고 높이가 높은 것이 보이게 된다. 예를 들어, 그림과 같은 경우엔 3개(6번, 3번, 2번)의 막대기가 보인다.



N개의 막대기에 대한 높이 정보가 주어질 때, 오른쪽에서 보아서 몇 개가 보이는지를 알아내는 프로그램을 작성하려고 한다.

입력
첫 번째 줄에는 막대기의 개수를 나타내는 정수 N (2 ≤ N ≤ 100,000)이 주어지고 이어지는 N줄 각각에는 막대기의 높이를 나타내는 정수 h(1 ≤ h ≤ 100,000)가 주어진다.

출력
오른쪽에서 N개의 막대기를 보았을 때, 보이는 막대기의 개수를 출력한다.

예제 입력 1
6
6
9
7
6
4
6
예제 출력 1
3
예제 입력 2
5
5
4
3
2
1
예제 출력 2
5
*/
import java.util.Scanner;

public class problem345 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int[] intArr = new int[size];

        for (int i = 0; i < size; i++) {
            intArr[i] = in.nextInt();
        }

        int result = 0; // 결과값 저장
        int max = 0;

        // 배열의 뒤 부터 순회한다. 오른쪽에서 보는것이기때문
        for (int i = intArr.length - 1; i >= 0; i--) {

            // max값 갱신
            if (intArr[i] > max) {
                max = intArr[i];
                result++;
            }
        }
        System.out.println(result);
    }
}