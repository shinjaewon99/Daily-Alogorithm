import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int count = 1; // 자기 자신을 포함하는 1가지
        int start = 1;
        int end = 1;
        int sum = 1;
        // 1 2 3 4 5 6 7 8 9 10

        while (end != n) {
            if (sum == n) {
                count++;
                end++;
                sum += end;
            } else if (sum > n) {
                sum -= start;
                start++;

            } else {
                end++;
                sum += end;
            }
        }
        System.out.print(count);
    }
}