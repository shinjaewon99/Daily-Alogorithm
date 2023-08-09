import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1. 테스트 갯수
        int testSize = in.nextInt();

        // 2. 테스트 수의 갯수
        for (int i = 0; i < testSize; i++) {
            // 3. 각 테스트 케이스의 수의 갯수
            int eachNumbers = in.nextInt();
            int[] numbers = new int[eachNumbers];
            for (int j = 0; j < eachNumbers; j++) {
                numbers[j] = in.nextInt();
            }

            long sum = 0;

            // 4. 최대공약수 누적 합
            for (int j = 0; j < eachNumbers - 1; j++) {
                for (int k = j + 1; k < eachNumbers; k++) {
                    sum += gcd(numbers[j], numbers[k]);
                }
            }
            System.out.println(sum);
        }
    }

    private static int gcd(int x, int y) {
        if (y == 0) return x;

        return gcd(y, x % y);
    }
}
