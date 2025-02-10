import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a = in.nextDouble(); // 오렌지
        double b = in.nextDouble(); // 사과
        double c = in.nextDouble(); // 파인애플

        double i = in.nextDouble();
        double j = in.nextDouble();
        double k = in.nextDouble();

        double max = Math.min(a/i, Math.min(b/j, c/k));

        double resultA = a - (max * i);
        double resultB = b - (max * j);
        double resultC = c - (max * k);

        System.out.printf("%.6f %.6f %.6f%n", resultA, resultB, resultC);
    }
}