/*
문제
이진수 덧셈은 매우 간단하고, 십진수 덧셈과 비슷하게 하면 된다. 십진수 덧셈을 할 때는, 오른쪽부터 왼쪽으로 차례대로 숫자 하나씩 더하면 된다. 이진수 덧셈도 이와 비슷하게 하면 된다. 십진수 덧셈은 외워야 할 덧셈이 많지만, 이진수 덧셈은 아래와 같이 5가지만 기억하면 된다.

0 + 0 = 0
1 + 0 = 1
0 + 1 = 1
1 + 1 = 10
1 + 1 + 1 = 11
두 이진수가 주어졌을 때, 그 합을 이진수로 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 수 T(1<=T<=1,000)가 주어진다. 각 테스트 케이스는 숫자 2개로 이루어져있다. 이 숫자는 0과 1로만 이루어진 이진수이며, 길이는 최대 80자리이다. (덧셈 결과는 81자리가 될 수도 있다) 이진수는 0으로 시작할 수도 있다.

출력
각 테스트 케이스에 대해 입력으로 주어진 두 이진수의 합을 구해 이진수로 출력한다. 숫자의 앞에 불필요한 0이 붙으면 안 된다.

예제 입력 1
3
1001101 10010
1001001 11001
1000111 1010110
예제 출력 1
1011111
1100010
10011101
*/
import java.math.BigInteger;
import java.util.Scanner;

public class problem278 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < size; i++) {
            String a = in.next();
            String b = in.next();

            // BigInteger : 큰 정수를 계산하기 위해, 2진수로 변환
            BigInteger n = new BigInteger(a, 2);
            BigInteger m = new BigInteger(b, 2);

            // StringBuilder에 2진수로 입력된 문자열을 정수로 변환후 append
            BigInteger total = n.add(m);

            // .toString(2) : 2진수로 변환
            sb.append(total.toString(2)).append("\n");
        }

        System.out.print(sb.toString());

    }
}

