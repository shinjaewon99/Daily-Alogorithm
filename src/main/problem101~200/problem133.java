/*
음료수 얼려 먹기
문제
N × M 크기의 얼음 틀이 있다. 구멍이 뚫려 있는 부분은 0, 칸막이가 존재하는 부분은 1로 표시된다.
구멍이 뚫려 있는 부분끼리 상, 하, 좌, 우로 붙어 있는 경우 서로 연결되어 있는 것으로 간주한다.
이때 얼음 틀의 모양이 주어졌을 때 생성되는 총 아이스크림의 개수를 구하는 프로그램을 작성하라.
다음의 4 × 5 얼음 틀 예시에서는 아이스크림이 총 3개가 생성된다


입력

첫 번째 줄에 얼음 틀의 세로 길이 N과 가로 길이 M이 주어진다. (1 <= N, M <= 1,000)
두 번째 줄부터 N + 1 번째 줄까지 얼음 틀의 형태가 주어진다.
이때 구멍이 뚫려있는 부분은 0, 그렇지 않은 부분은 1이다.
출력

한 번에 만들 수 있는 아이스크림의 개수를 출력한다.

입력 예시 1

4 5
00110
00011
11111
00000
출력 예시 1

3

입력 예시 2

15 14
00000111100000
11111101111110
11011101101110
11011101100000
11011111111111
11011111111100
11000000011111
01111111111111
00000000011111
01111111111000
00011111111000
00000001111000
11111111110011
11100011111111
11100011111111
출력 예시2

8
*/
import java.util.Scanner;

public class problem133 {
    public static int n;
    public static int m;
    public static int[][] frame;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        in.nextLine(); // 버퍼 비우기
        frame = new int[n][m];

        for (int i = 0; i < n; i++) {
            /**
             * 중요한 부분 한 줄 한 줄 입력받는것을 String으로 받는다.
             */
            String st = in.nextLine();
            for (int j = 0; j < m; j++) {
                // 아스키값 0을 빼줌으로써 정수로 담는다.
                frame[i][j] = st.charAt(j) - '0';
            }
        }

        System.out.print(result());
    }

    public static int result() {
        int result = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // 0 : 구멍이 뚫려있어, 아이스크림을 만들수있다.
                if (frame[i][j] == 0) {
                    dfs(i, j);
                    result++;
                }
            }
        }
        return result;
    }

    public static boolean dfs(int a, int b) {
        if(a < 0 || a >= n || b < 0 || b >= m ) {
            return false;
        }
        if (frame[a][b] == 0) {
            // 방문한 노드 처리
            frame[a][b] = 1;

            // 상 하 좌 우 를 노드로 묶어 재귀함수 처리한다.
            dfs(a - 1, b);
            dfs(a + 1, b);
            dfs(a, b - 1);
            dfs(a, b + 1);
            return true;
        }
        return false;
    }
}

