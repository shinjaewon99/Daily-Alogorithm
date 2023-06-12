/*
문제
수빈이는 동생 N명과 숨바꼭질을 하고 있다. 수빈이는 현재 점 S에 있고, 동생은 A1, A2, ..., AN에 있다.

수빈이는 걸어서 이동을 할 수 있다. 수빈이의 위치가 X일때 걷는다면 1초 후에 X+D나 X-D로 이동할 수 있다. 수빈이의 위치가 동생이 있는 위치와 같으면, 동생을 찾았다고 한다.

모든 동생을 찾기위해 D의 값을 정하려고 한다. 가능한 D의 최댓값을 구해보자.

입력
첫째 줄에 N(1 ≤ N ≤ 105)과 S(1 ≤ S ≤ 109)가 주어진다. 둘째 줄에 동생의 위치 Ai(1 ≤ Ai ≤ 109)가 주어진다. 동생의 위치는 모두 다르며, 수빈이의 위치와 같지 않다.

출력
가능한 D값의 최댓값을 출력한다.

예제 입력 1
3 3
1 7 11
예제 출력 1
2
예제 입력 2
3 81
33 105 57
예제 출력 2
24
예제 입력 3
1 1
1000000000
예제 출력 3
999999999
*/
import java.util.Arrays;
import java.util.Scanner;

public class problem466 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt(); // 동생 수
        int stay = in.nextInt(); // 내 위치
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            int a = in.nextInt();
            arr[i] = Math.abs(a - stay); // 내위치와 동생의 위치 절대값
        }
        Arrays.sort(arr);
        // 2 4 8
        int first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            first = gcd(first, arr[i]); // 최소 공배수 찾기
        }

        System.out.println(first);
    }

    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}

