/*
문제
악독한 코치 주혁은 선수들을 이름 순으로 세우는 것을 좋아한다. 더 악독한 것은 어떤 순서로 서야할지도 알려주지 않았다! 선수들의 이름이 주어질 때 어떤 순서로 이루어져있는지 확인해보자.

입력
첫째 줄에 N개의 이름이 주어진다. (2 ≤ N ≤ 20)

다음 N개의 줄에는 각 선수들의 이름이 주어진다. 이름은 2 이상 12 이하의 대문자로만 이루어져있다. 선수의 이름은 중복되지 않는다.

출력
이름이 증가하는 순으로 나타나면 INCREASING, 감소하는 순이면 DECREASING을 한 줄에 출력한다. 만약 위의 두 경우가 아니라면 NEITHER를 출력한다.

예제 입력 1
5
JOE
BOB
ANDY
AL
ADAM
예제 출력 1
DECREASING
예제 입력 2
11
HOPE
ALI
BECKY
JULIE
MEGHAN
LAUREN
MORGAN
CARLI
MEGAN
ALEX
TOBIN
예제 출력 2
NEITHER
예제 입력 3
4
GEORGE
JOHN
PAUL
RINGO
예제 출력 3
INCREASING
*/
import java.util.Scanner;

public class problem299 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.next();
        }

        // 오름차순, 내림차순 검증
        boolean INCREASING = true;
        boolean DECREASING = true;


        // compareTo : 두 문자열을 사전식으로 비교,
        // 반환값이 0보다 작으면 첫번째 문자열이 두번째 문자열보다 사전식으로 앞서는것이고,
        // 반환값이 0보다 크면 첫번째 문자열이 두번째 문자열보다 사전식으로 느린것이다.
        for (int i = 1; i < n; i++) {
            if (arr[i].compareTo(arr[i - 1]) > 0) {
                // 조건은 오름차순인데, 내림차순을 false해준다.
                DECREASING = false;
            } else if (arr[i].compareTo(arr[i - 1]) < 0) {
                INCREASING = false;
            }
        }

        if (INCREASING) {
            System.out.println("INCREASING");
        } else if (DECREASING) {
            System.out.println("DECREASING");
        } else {
            System.out.println("NEITHER");
        }
    }
}

