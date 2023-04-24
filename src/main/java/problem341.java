/*
문제
현진 치킨에서 판매하는 치킨은 양념 치킨, 후라이드 치킨, 반반 치킨으로 총 세 종류이다. 반반 치킨은 절반은 양념 치킨, 절반은 후라이드 치킨으로 이루어져있다. 양념 치킨 한 마리의 가격은 A원, 후라이드 치킨 한 마리의 가격은 B원, 반반 치킨 한 마리의 가격은 C원이다.

상도는 오늘 파티를 위해 양념 치킨 최소 X마리, 후라이드 치킨 최소 Y마리를 구매하려고 한다. 반반 치킨을 두 마리 구입해 양념 치킨 하나와 후라이드 치킨 하나를 만드는 방법도 가능하다. 상도가 치킨을 구매하는 금액의 최솟값을 구해보자.

입력
첫째 줄에 다섯 정수 A, B, C, X, Y가 주어진다.

출력
양념 치킨 최소 X마리, 후라이드 치킨 최소 Y마리를 구매하는 비용의 최솟값을 출력한다.

제한
1 ≤ A, B, C ≤ 5,000
1 ≤ X, Y ≤ 100,000
예제 입력 1
1500 2000 1600 3 2
예제 출력 1
7900
반반 치킨 4마리를 구매해서, 양념 치킨 2마리와 후라이드 치킨 2마리를 만들고, 양념 치킨 1마리를 구매하는 것이 최소이다.

예제 입력 2
1500 2000 1900 3 2
예제 출력 2
8500
예제 입력 3
1500 2000 500 90000 100000
예제 출력 3
100000000
*/
import java.util.Scanner;

public class problem341 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt(); // 양념
        int b = in.nextInt(); // 후라이드
        int c = in.nextInt(); // 반반

        int n = in.nextInt(); // 필요한 양념
        int m = in.nextInt(); // 필요한 후라이드

        int total = 0;

        // 후라이드, 양념이 반반세트보다 비쌀경우
        if (a + b > c * 2) {
            int temp = Math.min(n, m);
            // 최소한의 필요한 양념과 후라이드
            total += c * 2 * temp;

            // 양념이 더 필요한 경우
            if (n > temp) {
                total += (n - temp) * Math.min(a, c * 2);
            }

            // 후라이드가 더 필요한 경우
            if (m > temp) {
                total += (m - temp) * Math.min(b, c * 2);
            }
        }
        // 반반 세트가 아닌 따로 사는게 더 싼 경우
        else {
            total += n * Math.min(a, c * 2);
            total += m * Math.min(b, c * 2);
        }
        System.out.println(total);
    }
}

