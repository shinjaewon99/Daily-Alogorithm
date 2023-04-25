/*
문제
 
$N$개의 칸에
$1$ 부터
$N$ 까지의 수들이 왼쪽부터 순서대로 저장되어 있다. 또, 각 칸은 왼쪽부터
$1$ 부터
$N$까지 순서대로 번호가 붙어 있다. 즉, 처음에는 각 칸의 번호와 각 칸에 저장된 수가 같다.

아래 그림은
$N = 7$일 때의 예이다.



다음 작업을 수가 정확히 하나가 남을 때 까지 반복한다.

(A) 홀수번 칸의 수들을 모두 지운다 (B) 남은 수들을 왼쪽으로 모은다.

제일 첫 작업의 (A) 단계가 끝나면 칸들의 상태는 다음과 같을 것이다.



(B) 단계가 끝나면 다음과 같을 것이다.



두번째 작업이 진행되면 칸들은 아래 두 그림과 같이 바뀔 것이다.





이제 수가 하나 남았으므로 작업은 더 이상 진행되지 않는다.

 
$N$을 입력으로 받아 위와 같이 작업을 진행했을 때 마지막으로 남는 수를 계산하는 프로그램을 작성하라.

입력
첫 번째 줄에 정수
$N$이 주어진다.

출력
마지막으로 남는 수를 한 줄에 출력한다.

제한
 
$1 \le N \le 100$ 
서브태스크
번호	배점	제한
1	5
입출력 예제만이 주어짐.

2	15
 
$N \le 8$ 

3	30
 
$N$은 1, 2, 4, 8, 16, 32, 64 중 하나이다. 즉,
$N$은 1이거나, 2이거나, 2를 여러 번 곱한 수 중 하나이다.

4	50
 추가 제약 조건 없음

예제 입력 1
1
예제 출력 1
1
예제 입력 2
2
예제 출력 2
2
예제 입력 3
5
예제 출력 3
4
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problem347 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= size; i++) {
            list.add(i);
        }

        // list의 size가 1이될때까지 반복
        while (list.size() >= 2) {
            // list의 remove는 인덱스의 값을 삭제하고 요소(값)들이
            // 자동으로 인덱스가 당겨져 삭제됩니다. 삭제 -> 당겨짐 -> 삭제
            for (int i = 0; i < list.size(); i++) {
                list.remove(i);
            }
        }
        System.out.println(list.get(0));
    }
}
