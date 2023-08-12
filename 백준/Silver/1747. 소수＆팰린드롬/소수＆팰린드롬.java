import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1. 숫자 N 입력
        int number = in.nextInt();

        while (true) {

            // 2. 소수이면서 펠론드롬 숫자일 경우 break
            if (isPrime(number) && isPalindrome(number)) break;
            number++;
        }
        System.out.println(number);
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isPalindrome(int number) {
        String numStr = String.valueOf(number);
        // 투포인터로 펠린도름인지 접근
        int start = 0;
        int end = numStr.length() - 1;

        while (start < end) {
            if (numStr.charAt(start) != numStr.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
