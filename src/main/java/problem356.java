/*
문제
유진수는 어떤 수를 10진수로 표현한 뒤 그 수를 두 부분으로 나눴을 때, 앞부분 자리수의 곱과 뒷부분 자리수의 곱이 같을 때를 말한다.

예를 들어, 1221은 유진수이다. 12와 21로 나눴을 때, 앞부분 자리수의 곱 1*2는 뒷부분 자리수의 곱 2*1과 같기 때문이다. 1236도 마찬가지로 유진수이다. 하지만, 1234는 아니다. 수를 나눌 때 항상 연속된 자리수를 나눠야하고, 각 부분에 적어도 한자리는 있어야 한다.

예를 들어, 12345는 총 4가지 방법으로 나눌 수 있다. 1-2345, 12-345, 123-45, 1234-5 어떤 수 N이 주어질 때, 이 수가 유진수인지 아닌지 구하는 프로그램을 작성하시오.

입력
첫째 줄에 수 N이 주어진다. 이 수는 2,147,483,647보다 작거나 같은 자연수이다.

출력
첫째 줄에 N이 유진수이면 YES, 아니면 NO를 출력한다.

예제 입력 1
1236
예제 출력 1
YES
예제 입력 2
1
예제 출력 2
NO
예제 입력 3
1221
예제 출력 3
YES
예제 입력 4
4729382
예제 출력 4
NO
예제 입력 5
42393338
예제 출력 5
YES
*/
import java.util.Scanner;

public class problem356 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String inputString = in.nextLine();
        int length = inputString.length();

        boolean isCheck = false;

        // 12345 는 총 4가지로 나눌수있다.
        for (int i = 0; i < length - 1; i++) {

            int temp1 = 1; // 왼쪽 부분의 누적합
            int temp2 = 1; // 오른쪽 부분의 누적합


            // 왼쪽 부분의 합
            for (int j = 0; j <= i; j++) {
                temp1 *= inputString.charAt(j) - '0';

            }

            // i+1 번째부터 시작하는 이유는 나눌수 있는 가지수에서
            // 왼쪽부분을 제외하고 누적해줘야된다.
            for (int k = i + 1; k < length; k++) {
                temp2 *= inputString.charAt(k) - '0';
            }

            if (temp1 == temp2) {
                isCheck = true;
                break;
            }
        }

        if (isCheck) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
