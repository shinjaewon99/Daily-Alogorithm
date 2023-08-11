import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1. 수열의 길이 입력
        long testSize = in.nextLong();
        long[] numbers = new long[(int) testSize];

        // 2. 수열의 길이 만큼 원소 입력
        for (int i = 0; i < testSize; i++) {
            numbers[i] = in.nextLong();
        }


        // 4. 구한 소수중 최소공배수 구하기
        long total = 1;
        for (int i = 0; i < testSize; i++) {
            if (isPrime(numbers[i])) {
                total = lcm(total, numbers[i]);
            }
        }

        // 5. 출력
        if (total == 1) {
            System.out.println(-1);
        } else {
            System.out.println(total);
        }
    }

    // 3. 수열중 소수 구하기
    private static boolean isPrime(long num) {
        if (num <= 1) {
            return false;
        }
        for (long i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static long gcd(long num1, long num2) {
        if (num2 == 0) return num1;
        return gcd(num2, num1 % num2);
    }

    private static long lcm(long num1, long num2) {
        return num1 * num2 / gcd(num1, num2);
    }
}