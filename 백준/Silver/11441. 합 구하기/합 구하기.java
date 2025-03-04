import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] numbers = new int[n + 1];
        int[] sum = new int[n + 1]; 

        // 숫자 입력 및 누적 합 계산
        for (int i = 1; i <= n; i++) {
            numbers[i] = in.nextInt();
            sum[i] = sum[i - 1] + numbers[i]; // 누적 합 저장
        }

        int m = in.nextInt();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < m; i++) {
            int start = in.nextInt();
            int end = in.nextInt();
            output.append(sum[end] - sum[start - 1]).append("\n");
        }

        System.out.print(output.toString());
    }
}
