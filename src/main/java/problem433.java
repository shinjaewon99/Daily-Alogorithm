/*
문제
모든 자리가 1로만 이루어져있는 두 자연수 A와 B가 주어진다. 이때, A와 B의 최대 공약수를 구하는 프로그램을 작성하시오.

예를 들어, A가 111이고, B가 1111인 경우에 A와 B의 최대공약수는 1이고, A가 111이고, B가 111111인 경우에는 최대공약수가 111이다.

입력
첫째 줄에 두 자연수 A와 B를 이루는 1의 개수가 주어진다. 입력되는 수는 263보다 작은 자연수이다.

출력
첫째 줄에 A와 B의 최대공약수를 출력한다. 정답은 천만 자리를 넘지 않는다.

예제 입력 1
3 4
예제 출력 1
1
예제 입력 2
3 6
예제 출력 2
111
예제 입력 3
500000000000000000 500000000000000002
예제 출력 3
11
*/
import java.util.Scanner;

public class problem433 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        long num1 = in.nextLong();
        long num2 = in.nextLong();
        long gcd = gcd(num1, num2);

        // 최대공약수 값만큼 1 누적
        for (int i = 0; i < gcd; i++) {
            sb.append("1");
        }

        System.out.println(sb.toString());
    }

    // 최대 공약수
    static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

}
