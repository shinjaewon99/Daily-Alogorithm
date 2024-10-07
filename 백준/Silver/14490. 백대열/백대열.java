import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();

        String[] numbers = word.split(":");
        int num1 = Integer.parseInt(numbers[0]);
        int num2 = Integer.parseInt(numbers[1]);

        int div = gcd(num1, num2);

        System.out.println((num1 / div) + ":" + (num2 / div));
    }

    // 최대공약수 구하는 메소드
    private static int gcd(final int a, final int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
