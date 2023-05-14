/*
문제
한윤정과 친구들은 이탈리아로 방학 여행을 갔다. 이탈리아는 덥다. 윤정이와 친구들은 아이스크림을 사먹기로 했다. 아이스크림 가게에는 N종류의 아이스크림이 있다. 모든 아이스크림은 1부터 N까지 번호가 매겨져있다. 어떤 종류의 아이스크림을 함께먹으면, 맛이 아주 형편없어진다. 따라서 윤정이는 이러한 경우를 피하면서 아이스크림을 3가지 선택하려고 한다. 이때, 선택하는 방법이 몇 가지인지 구하려고 한다.

입력
첫째 줄에 정수 N과 M이 주어진다. N은 아이스크림 종류의 수이고, M은 섞어먹으면 안 되는 조합의 개수이다. 아래 M개의 줄에는 섞어먹으면 안 되는 조합의 번호가 주어진다. 같은 조합은 두 번 이상 나오지 않는다. (1 ≤ N ≤ 200, 0 ≤ M ≤ 10,000)

출력
첫째 줄에, 가능한 방법이 총 몇 개 있는지 출력한다.

예제 입력 1
5 3
1 2
3 4
1 3
예제 출력 1
3
힌트
5개의 아이스크림과 3가지 섞어먹으면 안 되는 조합이 있다. 1번은 2번 3번과 섞으면 안되고, 3번은 4번과 섞으면 안 된다. 따라서 (1 4 5), (2 3 5), (2 4 5)와 같이 3가지 방법이 있다.
*/
import java.util.Scanner;

public class problem353 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int type = in.nextInt();
        int count = in.nextInt();

        // 크기를 + 1 한 이유는 아이스크림이 1부터 type까지 번호 임으로
        boolean[][] flag = new boolean[type + 1][type + 1];

        for (int i = 0; i < count; i++) {
            int n = in.nextInt();
            int m = in.nextInt();

            // 안좋은 조합이 1,2 순서나 2,1 순서가 똑같음으로
            flag[n][m] = true;
            flag[m][n] = true;
        }

        int result = 0;

        // 서로다른 3가지의 아이스크림을 선택한다.
        // 순회하며 flag에 조합이 있는지 확인
        for (int i = 1; i <= type; i++) {
            for (int j = i + 1; j <= type; j++) {
                for (int k = j + 1; k <= type; k++) {
                    if (!flag[i][j] && !flag[i][k] && !flag[j][k]) {
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
