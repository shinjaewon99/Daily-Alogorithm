/*
문제
양의 정수 n개가 주어졌을 때, 가능한 모든 쌍의 GCD의 합을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수 t (1 ≤ t ≤ 100)이 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있다. 각 테스트 케이스는 수의 개수 n (1 < n ≤ 100)가 주어지고, 다음에는 n개의 수가 주어진다. 입력으로 주어지는 수는 1,000,000을 넘지 않는다.

출력
각 테스트 케이스마다 가능한 모든 쌍의 GCD의 합을 출력한다.

예제 입력 1
3
4 10 20 30 40
3 7 5 12
3 125 15 25
예제 출력 1
70
3
35
*/
import java.util.Scanner;

public class problem434 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt(); // 테스트 갯수


        for (int i = 0; i < test; i++) {
            int num = in.nextInt();
            int[] arr = new int[num];

            for (int j = 0; j < num; j++) {
                arr[j] = in.nextInt();
            }

            long sum = 0;

            // 최대 공약수 누적 합
            for (int j = 0; j < num - 1; j++) {
                for (int k = j + 1; k < num; k++) {
                    sum += gcd(arr[j], arr[k]);
                }
            }
            System.out.println(sum);
        }
    }

    // 최대 공약수
    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

}
