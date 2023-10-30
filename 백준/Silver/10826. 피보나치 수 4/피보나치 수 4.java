import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int input = in.nextInt();

        if (input == 0) {
            System.out.println(0);
        } else if (input == 1) {
            System.out.println(1);
        } else {
            // 1. 피보나치 dp 배열 생성, long 타입으로도 부족
            BigInteger[] fibo = new BigInteger[10001];

            // 2. fibo배열 초기값 설정
            fibo[0] = new BigInteger("0");
            fibo[1] = new BigInteger("1");

            // 3. dp 배열 값 할당
            for (int i = 2; i <= input; i++) {
                fibo[i] = fibo[i - 2].add(fibo[i - 1]);
            }

            System.out.println(fibo[input]);
        }
    }
}
