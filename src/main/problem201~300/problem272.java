/*
문제
민겸이는 크림 파스타를 먹다가 다음과 같은 문제를 생각해냈다.

빈 배열
\(A\)가 있다. 민겸이는
\(A\)의 맨 뒤에 정수를
\(N\)번 추가하려고 한다. 수를 그냥 추가하기만 하면 재미없으니, 수를 추가할 때마다 1 ≤
\(i\) ≤
\(j\) ≤
\(|A|\) 를 만족하는 정수
\(i\),
\(j\)에 대하여
\(A_j - A_i\)의 최댓값을 구하려고 한다.
\(|A|\)는 배열
\(A\)의 현재 길이를 뜻하고,
\(A_i\)는 민겸이가
\(i\)번째로 추가한 정수를 뜻한다.

민겸이가 식사를 마치기 전에 이 문제를 대신 풀어보자.

입력
입력은 두 줄로 주어진다.

첫 번째 줄에는 민겸이가 배열에 추가하려는 정수의 개수
\(N\)이 주어진다.

두 번째 줄에는
\(A_1\)부터
\(A_N\)까지
\(N\)개의 정수가 공백으로 구분되어 주어진다.

출력
각
\(A_i\)가 추가된 직후의 문제의 답
\(N\)개를 공백으로 구분하여 출력한다.

제한
1 ≤
\(N\) ≤ 200,000
1 ≤
\(A_i\) ≤ 109
예제 입력 1
6
50 100 70 110 10 100
예제 출력 1
0 50 50 60 60 90
예제 입력 2
6
3 3 2 8 3 1000000000
예제 출력 2
0 0 0 6 6 999999998
*/
import java.util.Scanner;

public class problem272 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int result = 0;
        int min = Integer.MAX_VALUE;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            int n = in.nextInt();
            if (min > n) {
                min = n; // min 값 갱신
            } else {
                result = Math.max(result, n - min); // 최대값 반환
            }
            sb.append(result).append(' ');
        }
        System.out.print(sb.toString());
    }
}

