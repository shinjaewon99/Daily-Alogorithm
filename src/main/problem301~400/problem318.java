/*
문제
대전 ACM-ICPC Regional가 끝나면, 대회 참가자들은 다같이 카이스트 근처의 동혁 피자에 간다. 대회는 5시간동안 진행되므로, 참가자는 모두 배가 매우 고프다. 피자를 최대한 빨리 먹기 위해서, 큰 피자를 하나 시키려고 한다. 생각해보니 피자가 너무 크면 식탁 위에 맞지 않을 수도 있다. 식탁은 원이고, 피자는 직사각형이다. 식탁의 반지름과 피자의 크기가 주어졌을 때, 피자가 식탁에 맞는 크기인지 아닌지를 구하는 프로그램을 작성하시오.

입력
입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 테스트 케이스는 숫자 세 개로 이루어져 있고, 순서대로 r, w, l이다. r은 식탁의 반지름이고, w와 l은 피자의 너비와 높이이다. (1 ≤ r ≤ 1000, 1 ≤ w ≤ l ≤ 1000) r이 0이 들어오는 경우에는 프로그램을 종료한다.

출력
각 테스트 케이스에 대해서, 피자가 식탁 위에 놓여질 수 있는지 아닌지를 출력한다. 피자가 식탁의 경계와 접하는 경우는 식탁에 놓여질 수 있다.

예제 입력 1
38 40 60
35 20 70
50 60 80
0
예제 출력 1
Pizza 1 fits on the table.
Pizza 2 does not fit on the table.
Pizza 3 fits on the table.
*/

import java.util.Scanner;

public class problem318 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = 0;
        while (true) {
            double sum = 0;
            double r = in.nextDouble(); // 식탁의 반지름
            if (r == 0) {
                break;
            }
            double w = in.nextDouble(); // 피자의 너비
            sum += Math.pow(w, 2);

            double l = in.nextDouble(); // 피자의 높이
            sum += Math.pow(l, 2);

            r *= 2; // 식탁의 넓이

            count++;
            // sum = 사각형의 대각선의 길이,
            // 가로(너비) 제곱 + 세로(높이)의 제곱의 루트 (Math.sqrt)
            if (r >= Math.sqrt(sum)) {
                System.out.println("Pizza " + count +
                        " fits on the table.");
            } else {
                System.out.println("Pizza " + count +
                        " does not fit on the table.");
            }
        }
    }
}

