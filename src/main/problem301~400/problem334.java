/*
문제
문제는 매우 간단하다. N을 N번 출력하는 프로그램을 작성하여라. 다만, 답이 길어지는 경우 답의 앞 M자리만 출력한다.

입력
첫 번째 줄에는 N, M이 주어진다. (1 ≤ N, M ≤ 2016)

출력
N을 N번 출력한다. 만약 답이 길어지면 답의 앞 M자리를 출력한다.

예제 입력 1
20 16
예제 출력 1
2020202020202020
*/

import java.util.Scanner;

public class problem334 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int size = in.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(n);
        }

        if (sb.length() > size) {
            // size의 길이보다 길면 size자리만큼 출력한다.
            System.out.println(sb.substring(0, size).toString());
        } else {
            System.out.println(sb.toString());
        }
    }
}