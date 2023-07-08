import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();

        while (size-- > 0) {
            int number = in.nextInt();
            int[] fibo0 = new int[41]; // number의 최대 
            int[] fibo1 = new int[41];
            fibo0[0] = 1;
            fibo0[1] = 0;
            fibo1[0] = 0;
            fibo1[1] = 1;

            // dp 탐색
            for (int i = 2; i <= number; i++) {
                fibo0[i] = fibo0[i - 2] + fibo0[i - 1];
                fibo1[i] = fibo1[i - 2] + fibo1[i - 1];
            }

            System.out.println(fibo0[number] + " " + fibo1[number]);
        }
    }
}
