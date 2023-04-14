/*
문제
병든 나이트가 N × M 크기 체스판의 가장 왼쪽아래 칸에 위치해 있다. 병든 나이트는 건강한 보통 체스의 나이트와 다르게 4가지로만 움직일 수 있다.

2칸 위로, 1칸 오른쪽
1칸 위로, 2칸 오른쪽
1칸 아래로, 2칸 오른쪽
2칸 아래로, 1칸 오른쪽
병든 나이트는 여행을 시작하려고 하고, 여행을 하면서 방문한 칸의 수를 최대로 하려고 한다. 병든 나이트의 이동 횟수가 4번보다 적지 않다면, 이동 방법을 모두 한 번씩 사용해야 한다. 이동 횟수가 4번보다 적은 경우(방문한 칸이 5개 미만)에는 이동 방법에 대한 제약이 없다.

체스판의 크기가 주어졌을 때, 병든 나이트가 여행에서 방문할 수 있는 칸의 최대 개수를 구해보자.

입력
첫째 줄에 체스판의 세로 길이 N와 가로 길이 M이 주어진다. N과 M은 2,000,000,000보다 작거나 같은 자연수이다.

출력
병든 나이트가 여행에서 방문할 수 있는 칸의 개수중 최댓값을 출력한다.

예제 입력 1
100 50
예제 출력 1
48
예제 입력 2
1 1
예제 출력 2
1
예제 입력 3
17 5
예제 출력 3
4
예제 입력 4
2 4
예제 출력 4
2
예제 입력 5
20 4
예제 출력 5
4
*/
import java.util.Scanner;

public class problem224 {

    static int n;
    static int m;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();
        System.out.print(result());
    }

    private static int result() {
        if (n == 1) {
            return 1; // 해당 서있는 위치 1번 카운트
        }
        if (n == 2) {
            // 이동 횟수가 4번까지는 제약 X
            // 2열 일때 최대 이동 가능 횟수는 4이다.
            return Math.min(4, (m + 1) / 2);
        }
        if (m < 7) {
            // 3열 이상, 7행 보다 낮을 경우는 최대 4번 이동 가능
            return Math.min(4, m);
        }
        return m - 2;
    }
}