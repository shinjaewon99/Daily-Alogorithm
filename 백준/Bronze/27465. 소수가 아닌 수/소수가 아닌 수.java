import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        System.out.println(findNonPrime(number));
    }

    private static int findNonPrime(int number) {
        while (true) {
            if (!isPrime(number)) {
                return number; // 소수가 아닌 경우 바로 반환
            }
            number++;
        }
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false; // 1 또는 0은 소수가 아님
        }
        for (int i = 2; i <= Math.sqrt(num); i++) { // 소수 판별
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
