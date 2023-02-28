/*
문제
정수 N이 입력되면 00시 00분 00초부터 N시 59분 59초까지의 모든 시각 중에서 3이 하나라도 포함되는 모든 경우의 수를 구하는 프로그램을 작성하시오. 예를 들어 1을 입력했을 때 다음은 3이 하나라도 포함되어 있으므로 세어야 하는 시각이다.

00시 00분 03초
00시 13분 30초
반면에 다음은 3이 하나도 포함되어 있지 않으므로 세면 안 되는 시각이다.

00시 02분 55초
01시 27분 45초
(입력 조건)

첫째 줄에 정수 N이 입력된다. (0<=N<=23)
(출력조건)

00시 00분 00초부터 N시 59분 59초까지의 모든 시각 중에서 3이 하나라도 포함되는 모든 경우의 수를 출력한다.
입력 예시
5

출력 예시
11475
*/
import java.util.Scanner;

public class problem130 {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int hour = in.nextInt();

        int result = 0;
        for (int i = 0; i <= hour; i++) {
            for (int minute = 0; minute < 60; minute++) {
                for (int second = 0; second < 60; second++) {
                    // 시간, 분, 초 중에 3을 포함하고 있으면 result를 증가시켜준다.
                    if (i % 10 == 3 || minute / 10 == 3 || minute % 10 == 3 || second / 10 == 3 || second % 10 == 3) {
                        result++;
                    }
                }
            }
        }
        System.out.print(result);
    }
}
