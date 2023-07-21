import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt(); // 테스트 케이스 갯수

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            System.out.println(lcm(a, b));
        }
    }

    // 최대 공약수 메소드
    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // 최소 공배수 메소드
    private static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
