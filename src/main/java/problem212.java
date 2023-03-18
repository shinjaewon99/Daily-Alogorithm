import java.util.Scanner;

public class problem212 {
    public static void main(String[] args) {

        // 간단한 구현문제다.

        Scanner in = new Scanner(System.in);


        int sum = 0;
        int min = 100;
        for (int i = 0; i < 7; i++) {
            int n = in.nextInt();
            if (n % 2 == 1) {
                sum += n;
                min = Math.min(min, n);
            }
        }

        if (sum == 0) {
            System.out.print(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }

    }
}


