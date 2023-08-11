import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1. 입력될 수의 갯수
        int inputNumbers = in.nextInt();
        int[] numbers = new int[inputNumbers];

        for (int i = 0; i < inputNumbers; i++) {
            numbers[i] = in.nextInt();
        }

        // 2. 비교할 수 입력
        int compare = in.nextInt();

        // 3. 최대 공약수가 1인 수를 찾습니다.
        long sum = 0;
        int length = 0;
        for (int i = 0; i < inputNumbers; i++) {
            int findNumber = gcd(numbers[i], compare);
            if (findNumber == 1) {
                sum += numbers[i];
                length++;
            }
        }
        System.out.println((double) sum / length);
    }

    private static int gcd(int num1, int num2) {
        if (num2 == 0) return num1;

        return gcd(num2, num1 % num2);
    }
}
