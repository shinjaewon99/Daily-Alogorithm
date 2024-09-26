import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        if (size == 1) {
            System.out.println(4);
        } else {
            long[] arr = new long[size];

            arr[0] = 1; // 초기값 설정
            arr[1] = 1; // 초기값 설정

            for (int i = 2; i < size; i++) {
                arr[i] = arr[i - 1] + arr[i - 2]; // 점화식
            }

            long result = (2 * arr[size - 1]) + (2 * (arr[size - 1] + arr[size - 2]));
            System.out.println(result);
        }
    }
}
