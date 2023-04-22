/*
문제
일반적인 구구단에서 가장 큰 수는 마지막 항의 값이 제일 크다. 거꾸로 구구단에서는, 각 항에 구구단의 계산 결과로 나온 값을 뒤집어 저장을 한다. 이렇게 하면 가장 큰 값이 항상 마지막이 아니게 된다. 예를 들어 8단의 9개 항의 값은 8, 16, 24, 32, 40, 48, 56, 64, 72 이 되어 72가 가장 크지만, 거꾸로 구구단에서는 8, 61, 42, 23, 4, 84, 65, 46, 27 가 되어 84가 가장 큰 값을 가지게 된다.

단의 수 N과 항의 수 K가 주어질 때, 거꾸로 구구단의 가장 큰 값을 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 N과 K가 주어진다. 두 수는 모두 1,000보다 작거나 같은 자연수이다.

출력
첫째 줄에 주어진 단과 항에서 나올 수 있는 가장 큰 거꾸로 구구단의 값을 출력한다.

예제 입력 1
8 9
예제 출력 1
84
*/
import java.util.Scanner;

public class problem338 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int max = 0;
        for (int i = 1; i <= m; i++) {
            int temp = n * i;
            String str = String.valueOf(temp); // 정수를 문자열로 변환
            StringBuilder sb = new StringBuilder();

            // 81 -> 18 뒤집기
            for (int j = str.length() - 1; j >= 0; j--) {
                sb.append(str.charAt(j)); //
            }
            // max값 할당, 문자열을 정수로 변환
            max = Math.max(max, Integer.parseInt(sb.toString()));
        }
        System.out.println(max);
    }
}
