/*
문제
오각형의 각 변에 아래 그림과 같이 점을 찍어 나간다. N단계에서 점의 개수는 모두 몇 개일까?



입력
첫째 줄에 N(1 ≤ N ≤ 10,000,000)이 주어진다.

출력
첫째 줄에 N단계에서 점의 개수를 45678로 나눈 나머지를 출력한다.

예제 입력 1
3
예제 출력 1
22
예제 입력 2
1
예제 출력 2
5
예제 입력 3
19
예제 출력 3
590
*/
import java.util.Scanner;

public class problem316 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int result = 5;


        for (int i = 1; i < n; i++) {
            // ex : 입력값 3
            // 5 + (3*3-2) + (4*3-2) 이다.
            result = (result + (i + 2) * 3 - 2) % 45678;
        }
        System.out.println(result);
    }
}

