import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[m + 1];

        for (int i = 2; i <= m; i++) {
            arr[i] = i; // 배열에 1부터 m까지 값을 초기화해준다.
        }

        // 제곱근 까지만 검증
        for (int i = 2; i <= Math.sqrt(m); i++) {
            if (arr[i] == 0) continue;
            // i의 배수를 0으로 바꿔준다.
            for (int j = i + i; j <= m; j += i) {
                arr[j] = 0;
            }
        }

        // 문제에서 n 부터 시작해서 m까지의 소수 갯수
        for (int i = n; i <= m; i++) {
            if (arr[i] != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}