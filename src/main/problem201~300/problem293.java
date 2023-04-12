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

public class problem293 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // 스크린 크기
        int m = in.nextInt(); // 바구니 크기
        int apple = in.nextInt(); // 사과 갯수

        int left = 1; // 바구니의 왼쪽 좌표
        int right = m; // 바구니의 오른쪽 좌표 (바구니의 크기 끝의 좌표가 오른쪽 좌표)
        int total = 0;


        for (int i = 0; i < apple; i++) {
            int temp = in.nextInt();

            // 바구니 안쪽에 떨어진 경우
            if (left <= temp && temp <= right) {
                continue;
            }
            // 바구니 왼쪽에 가깝게 떨어지는 경우
            if (left > temp) {
                total += (left - temp);
                right -= (left - temp);
                left = temp;

            }
            // 바구니 오른쪽에 가깝게 떨어지는 경우
            else {
                total += (temp - right);
                left += (temp - right); // 왼쪽 좌표 갱신
                right = temp;
            }
        }
        System.out.print(total);
    }
}