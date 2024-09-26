import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // 반의 수


        for (int i = 0; i < t; i++) {
            int n = in.nextInt(); // 학생수

            int[] arr = new int[n];
            int gap = 0;

            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }

            Arrays.sort(arr);

            // 30 25 76 23 78
            // 23 25 30 76 78
            for (int k = 0; k < n - 1; k++) {
                gap = Math.max(gap, arr[k + 1] - arr[k]); // 값의 차이중 최대값
            }

            System.out.println("Class " + (i + 1));
            System.out.println("Max " + arr[arr.length - 1] + ", " + "Min " + arr[0] + ", " + "Largest gap " + gap);

        }
    }
}
