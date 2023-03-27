/*
절댓값 힙
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초 (추가 시간 없음) (하단 참고)	256 MB	37539	20917	16849	56.334%
문제
절댓값 힙은 다음과 같은 연산을 지원하는 자료구조이다.

배열에 정수 x (x ≠ 0)를 넣는다.
배열에서 절댓값이 가장 작은 값을 출력하고, 그 값을 배열에서 제거한다. 절댓값이 가장 작은 값이 여러개일 때는, 가장 작은 수를 출력하고, 그 값을 배열에서 제거한다.
프로그램은 처음에 비어있는 배열에서 시작하게 된다.

입력
첫째 줄에 연산의 개수 N(1≤N≤100,000)이 주어진다. 다음 N개의 줄에는 연산에 대한 정보를 나타내는 정수 x가 주어진다. 만약 x가 0이 아니라면 배열에 x라는 값을 넣는(추가하는) 연산이고, x가 0이라면 배열에서 절댓값이 가장 작은 값을 출력하고 그 값을 배열에서 제거하는 경우이다. 입력되는 정수는 -231보다 크고, 231보다 작다.

출력
입력에서 0이 주어진 회수만큼 답을 출력한다. 만약 배열이 비어 있는 경우인데 절댓값이 가장 작은 값을 출력하라고 한 경우에는 0을 출력하면 된다.

예제 입력 1
18
1
-1
0
0
0
1
1
-1
-1
2
-2
0
0
0
0
0
0
0
예제 출력 1
-1
1
0
-1
-1
1
1
-2
2
0
*/

import java.util.PriorityQueue;
import java.util.Scanner;

public class problem248 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
            // 정렬 기준을 재정의 한다

            int first = Math.abs(o1);
            int second = Math.abs(o2);
            // 절대값이 같은 경우 음수 우선
            if (first == second) {
                if (o1 > o2) {
                    return 1;
                }
                return -1;
            }
            // 절대값 작은 데이터 우선
            return first - second;
        });


        for (int i = 0; i < n; i++) {
            int val = in.nextInt();
            // 입력값이 0이거나 우선순위 큐가 비어있을경우.
            if (val == 0) {
                if (pq.isEmpty()) System.out.println("0");
                else System.out.println(pq.poll());
            } else {
                pq.add(val);
            }
        }
    }
}
