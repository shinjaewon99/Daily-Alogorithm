/*
문제
적록색약은 빨간색과 초록색의 차이를 거의 느끼지 못한다. 따라서, 적록색약인 사람이 보는 그림은 아닌 사람이 보는 그림과는 좀 다를 수 있다.

크기가 N×N인 그리드의 각 칸에 R(빨강), G(초록), B(파랑) 중 하나를 색칠한 그림이 있다. 그림은 몇 개의 구역으로 나뉘어져 있는데, 구역은 같은 색으로 이루어져 있다. 또, 같은 색상이 상하좌우로 인접해 있는 경우에 두 글자는 같은 구역에 속한다. (색상의 차이를 거의 느끼지 못하는 경우도 같은 색상이라 한다)

예를 들어, 그림이 아래와 같은 경우에

RRRBB
GGBBB
BBBRR
BBRRR
RRRRR
적록색약이 아닌 사람이 봤을 때 구역의 수는 총 4개이다. (빨강 2, 파랑 1, 초록 1) 하지만, 적록색약인 사람은 구역을 3개 볼 수 있다. (빨강-초록 2, 파랑 1)

그림이 입력으로 주어졌을 때, 적록색약인 사람이 봤을 때와 아닌 사람이 봤을 때 구역의 수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 N이 주어진다. (1 ≤ N ≤ 100)

둘째 줄부터 N개 줄에는 그림이 주어진다.

출력
적록색약이 아닌 사람이 봤을 때의 구역의 개수와 적록색약인 사람이 봤을 때의 구역의 수를 공백으로 구분해 출력한다.

예제 입력 1
5
RRRBB
GGBBB
BBBRR
BBRRR
RRRRR
예제 출력 1
4 3
*/

import java.util.Scanner;

public class problem221 {
    static int n;
    static String str;
    static char[][] arr;
    static boolean[][] visit;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();

        // 배열 초기화
        arr = new char[n + 1][n + 1];
        visit = new boolean[n + 1][n + 1];

        for (int i = 0; i < n; i++) {
            str = in.next();
            for (int j = 0; j < n; j++) {
                arr[i][j] = str.charAt(j); // R R R B B 문자 저장
            }
        }
        // 적록색약이 아닌경우
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visit[i][j]) {
                    DFS(i, j);
                    count++;
                }
            }
        }
        int normalCount = count;
        count = 0; // 초기화

        // 적록색약 인경우
        visit = new boolean[n+1][n+1];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j] == 'R'){
                    arr[i][j] = 'G'; // R을 G로 바꿔준다.
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visit[i][j]) {
                    DFS(i, j);
                    count++;
                }
            }
        }
        int aCount = count;


        System.out.print(normalCount + " " + aCount);
    }

    private static void DFS(int a, int b) {
        visit[a][b] = true;
        char ch = arr[a][b];
        for(int i = 0; i < 4; i++){
            int nowX = a + dx[i];
            int nowY = b + dy[i];
            if(nowX >= 0 && nowY >= 0 && nowX < n && nowY < n ){
                // 방문하지 않은 노드이면서, 알파벳이 이어지는지 확인.
                if(!visit[nowX][nowY] && arr[nowX][nowY] == ch){
                    DFS(nowX,nowY);
                }
            }
        }
    }
}


