import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // 배열 A의 크기
        int m = in.nextInt(); // 배열 B의 크기
        int[] nArr = new int[n];
        int[] mArr = new int[m];

        for (int i = 0; i < n; i++) {
            nArr[i] = in.nextInt();
        }

        for (int i = 0; i < m; i++) {
            mArr[i] = in.nextInt();
        }

        // 투 포인터 선언
        int start = 0; // 시작 포인터
        int end = 0; // 끝 포인터
        StringBuilder output = new StringBuilder();


        while (true) {
            // mArr 배열의 값이 더 크거나 같을경우 시작 포인터 증가
            if (nArr[start] <= mArr[end]) {
                output.append(nArr[start] + " ");
                start++;
            }
            // nArr 배열의 값이 더 클경우 끝 포인터 증가
            else {
                output.append(mArr[end] + " ");
                end++;
            }
            if (start == n || end == m) break;
        }

        if (start == n) {
            for (int i = end; i < m; i++) {
                output.append(mArr[i] + " ");
            }
        }

        if (end == m) {
            for (int i = start; i < n; i++) {
                output.append(nArr[i] + " ");
            }
        }
        System.out.println(output.toString());
    }
}
