/*
문제
5×5 크기의 숫자판이 있다. 각각의 칸에는 숫자(digit, 0부터 9까지)가 적혀 있다. 이 숫자판의 임의의 위치에서 시작해서, 인접해 있는 네 방향으로 다섯 번 이동하면서, 각 칸에 적혀있는 숫자를 차례로 붙이면 6자리의 수가 된다. 이동을 할 때에는 한 번 거쳤던 칸을 다시 거쳐도 되며, 0으로 시작하는 000123과 같은 수로 만들 수 있다.

숫자판이 주어졌을 때, 만들 수 있는 서로 다른 여섯 자리의 수들의 개수를 구하는 프로그램을 작성하시오.

입력
다섯 개의 줄에 다섯 개의 정수로 숫자판이 주어진다.

출력
첫째 줄에 만들 수 있는 수들의 개수를 출력한다.

예제 입력 1
1 1 1 1 1
1 1 1 1 1
1 1 1 1 1
1 1 1 2 1
1 1 1 1 1
예제 출력 1
15
*/
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class problem223 {

    static int[][] map;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static Set<String> set = new HashSet<>();
    static int count;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        map = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                map[i][j] = in.nextInt();
            }
        }

        // x위치, y위치 (전체의 경우의수를 확인한다)
        String st = " ";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                DFS(i, j, 0, st);
            }
        }

        System.out.println(set.size());

    }

    private static void DFS(int x, int y, int count, String str) {
        // 6자리씩 끊어서 확인한다.
        if (count == 6) {
            set.add(str);
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nowX = x + dx[i];
            int nowY = y + dy[i];

            // 범위안의 값인지 확인
            if (nowX >= 0 && nowX < 5 && nowY >= 0 && nowY < 5) {
                // 문자열 + 정수 = 문자로 반환
                DFS(nowX, nowY, count + 1, str + map[nowX][nowY]);
            }
        }
    }
}






