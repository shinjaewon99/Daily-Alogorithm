import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 카드 갯수
        int m = in.nextInt(); // 최대값

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int max = 0;
        Arrays.sort(arr);

        // 카드를 3장 뽑아야 함으로 3중 for 문
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = arr[i] + arr[j] + arr[k];

                    // 근사치에 접근
                    if(max < sum && sum <= m){
                        max = sum; // 새로운 max값 할당
                    }
                }
            }
        }
        System.out.println(max);
    }
}
