/*
문제
앨버타의 자동차 번호판은 ABC-0123 (세 글자, 네 숫자)와 같이 두 부분으로 나누어져 있다.

좋은 번호판은 첫 번째 부분의 가치와 두 번째 부분의 가치의 차이가 100을 넘지 않는 번호판이다.

글자로 이루어진 첫 번째 부분의 가치는 글자를 26진법 수처럼 계산한다. (각 자리가 [A..Z]) 예를 들어, "ABC"의 가치는 28 (0×262 + 1×261 + 2×260)이 된다. "ABC-0123"은  |28 - 123| ≤ 100 이기 때문에, 좋은 번호판이다.

자동차 번호판이 주어졌을 때, 좋은 번호판인지 아닌지를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 번호판의 수 N (1 ≤ N ≤ 100)이 주어진다. 다음 N개 줄에는 자동차 번호판이 LLL-DDDD 형식으로 주어진다.

출력
각각의 자동차 번호판에 대해서, 좋은 번호판이면 "nice"를, 아니면 "not nice"를 출력한다.

예제 입력 1
2
ABC-0123
AAA-9999
예제 출력 1
nice
not nice
*/
import java.util.Scanner;

public class problem315 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            String str = in.next();
            String[] arr = str.split("-");
            String a = arr[0]; // 세 글자
            String b = arr[1]; // 네 숫자

            int totalA = 0;
            for (int j = 0; j < a.length(); j++) {
                int temp = a.charAt(j) - 'A';
                // 자릿수의 제곱값 계산
                temp *= Math.pow(26, 2 - j);
                totalA += temp;
            }

            int totalB = Integer.parseInt(b);

            // 절대값이 100 이하면 nice, 그렇지 않으면 not nice
            if (Math.abs(totalA - totalB) <= 100) {
                System.out.println("nice");
            } else {
                System.out.println("not nice");
            }

        }
    }
}

