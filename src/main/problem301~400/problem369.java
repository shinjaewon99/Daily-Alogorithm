/*
어떤 수 n이 입력되면 n의 각 자릿수의 합이 한 자리가 될때까지 계산하여 출력하시오.

예) 1234567

1234567 → 1+2+3+4+5+6+7 = 28 → 2 + 8 = 10 → 1 + 0 = 1

입력
자연수 n이 입력된다. (1 <= n <= 10,000,000)

출력
자릿수의 합이 한자리가 될때까지 계산하여 출력한다.

입력 예시
1234567

출력 예시
1
*/
import java.util.Scanner;

public class problem369 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        // sum이 두자리 인경우
        while (sum >= 10) {
            int newSum = 0;

            while (sum > 0) {
                newSum += sum % 10;
                sum /= 10;
            }

            sum = newSum;
        }
        System.out.println(sum);
    }
}
