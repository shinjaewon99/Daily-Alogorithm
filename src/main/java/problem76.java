/*
문제
상근이는 2863번에서 표를 너무 열심히 돌린 나머지 5와 6을 헷갈리기 시작했다.

상근이가 숫자 5를 볼 때, 5로 볼 때도 있지만, 6으로 잘못 볼 수도 있고, 6을 볼 때는, 6으로 볼 때도 있지만, 5로 잘못 볼 수도 있다.

두 수 A와 B가 주어졌을 때, 상근이는 이 두 수를 더하려고 한다. 이때, 상근이가 구할 수 있는 두 수의 가능한 합 중, 최솟값과 최댓값을 구해 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 두 정수 A와 B가 주어진다. (1 <= A,B <= 1,000,000)

출력
첫째 줄에 상근이가 구할 수 있는 두 수의 합 중 최솟값과 최댓값을 출력한다.

예제 입력 1
11 25
예제 출력 1
36 37
예제 입력 2
1430 4862
예제 출력 2
6282 6292
예제 입력 3
16796 58786
예제 출력 3
74580 85582
*/

import java.util.Scanner;

public class problem76 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String a = in.next();
        String b = in.next();

        String minA = "";
        String maxA = "";

        String minB = "";
        String maxB = "";


        for(int i = 0; i < a.length(); i++) {

            if(a.charAt(i) == '6') {
                minA = minA + "5";
            }else {
                // 6이 아닐경우 입력받은 숫자 그대로 대입
                minA = minA + a.charAt(i);
            }

            if(a.charAt(i) == '5') {
                maxA = maxA + "6";
            }else {
                // 5가 아닐 경우 입력받은 숫자 그대로 대입
                maxA = maxA + a.charAt(i);
            }

        }

        for(int i = 0; i < b.length(); i++) {

            if(b.charAt(i) == '6') {
                minB = minB + "5";
            }else {
                // 6이 아닐경우 입력받은 숫자 그대로 대입
                minB = minB + b.charAt(i);
            }

            if(b.charAt(i) == '5') {
                maxB = maxB + "6";
            }else {
                // 5가 아닐 경우 입력받은 숫자 그대로 대입
                maxB = maxB + b.charAt(i);
            }

        }


        int totalmax = Integer.parseInt(maxA) + Integer.parseInt(maxB);
        int totalmin = Integer.parseInt(minA) + Integer.parseInt(minB);


        System.out.print(totalmin + " " + totalmax);
    }

}
