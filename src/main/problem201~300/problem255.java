/*
문제
1부터 N까지의 수를 이어서 쓰면 다음과 같이 새로운 하나의 수를 얻을 수 있다.

1234567891011121314151617181920212223...

이렇게 만들어진 새로운 수는 몇 자리 수일까? 이 수의 자릿수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 N(1 ≤ N ≤ 100,000,000)이 주어진다.

출력
첫째 줄에 새로운 수의 자릿수를 출력한다.

예제 입력 1
5
예제 출력 1
5
예제 입력 2
15
예제 출력 2
21
예제 입력 3
120
예제 출력 3
252
*/
import java.util.Scanner;

public class problem255 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int plus = 1; // 자릿수 1부터 시작
        int div = 10;

        int count = 0;
        for (int i = 1; i <= n; i++) {
            // 10 100 1000
            if (i % div == 0) {
                plus++; // 10 = 자릿수 2
                div *= 10; // 자릿수 증가
            }
            count += plus;
        }
        System.out.println(count);
    }
}

