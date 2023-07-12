import java.util.Scanner;

public class Main {
    static int[][] graph;
    static int count;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        graph = new int[5][5];

        // 빙고판 입력
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                graph[i][j] = in.nextInt();
            }
        }

        // 사회자가 부른수 입력
        for (int i = 1; i <= 25; i++) {
            int compare = in.nextInt();

            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    // 빙고판에서 사회자가 부른 숫자가 있는경우 -1로 할당해준다.
                    if (graph[j][k] == compare) graph[j][k] = -1;
                }
            }
            rowCheck();
            columnCheck();
            leftToRightCheck();
            rightToLeftCheck();

            if (count >= 3) {
                System.out.println(i);
                break;
            }
            // 0으로 초기화 해주는 이유는 빙고 한개를 찾았을경우, 그 빙고의 갯수가 계속 누적되어 증가하게된다.
            count = 0;
        }
    }

    // 행 체크
    static void rowCheck() {
        for (int i = 0; i < 5; i++) {
            int totalCount = 0;
            for (int j = 0; j < 5; j++) {
                if (graph[i][j] == -1) totalCount++;
            }
            if (totalCount == 5) {
                count++;
            }
        }
    }

    // 열 체크
    static void columnCheck() {
        for (int i = 0; i < 5; i++) {
            int totalCount = 0;
            for (int j = 0; j < 5; j++) {
                if (graph[j][i] == -1) totalCount++;
            }
            if (totalCount == 5) {
                count++;
            }
        }
    }

    // 왼쪽에서 오른쪽으로 가는 대각선 체크
    static void leftToRightCheck() {
        int totalCount = 0;
        // 열 행 동시에 증가
        for (int i = 0; i < 5; i++) {
            if (graph[i][i] == -1) totalCount++;
        }
        if (totalCount == 5) {
            count++;
        }
    }

    // 오른쪽에서 왼쪽으로 가는 대각선 체크
    static void rightToLeftCheck() {
        int totalCount = 0;
        // 열 행 동시에 증가
        for (int i = 0; i < 5; i++) {
            if (graph[i][4 - i] == -1) totalCount++;
        }
        if (totalCount == 5) {
            count++;
        }
    }
}
