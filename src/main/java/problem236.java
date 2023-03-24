/*
문제
윤진이는 이번에 카우버거 알바생으로 뽑히게 되었다. 그녀는 카우버거를 평소에 이용하면서 들었던 의문점 한가지가 있었다.

"카우버거에는 왜 세트 메뉴에 대한 할인이 존재하지 않는가?"

따라서 윤진이의 아이디어로 카우버거에 세트 할인을 도입하고자 한다. 세트 메뉴는 버거 1개, 사이드 메뉴 1개, 음료 1개를 선택 할 경우 각각의 제품에 대해서 10%의 세트 할인을 적용하는 방식으로 진행된다.

하지만 카우버거 점주는 POS기의 소프트웨어가 오래되어 세트 할인에 대한 내용을 추가할 수가 없었다. 따라서 소프트웨어학부에 재학 중인 윤진이는 전공을 살려 직접 프로그램을 만들어보려고 한다. 윤진이를 도와 POS기에 들어갈 세트 할인에 대한 프로그램을 작성해보자.

입력
첫째 줄에는 주문한 버거의 개수 B, 사이드 메뉴의 개수 C, 음료의 개수 D가 공백을 사이에 두고 순서대로 주어진다. (1 ≤ B, C, D ≤ 1,000)

둘째 줄에는 각 버거의 가격이 공백을 사이에 두고 주어진다.

셋째 줄에는 각 사이드 메뉴의 가격이 공백을 사이에 두고 주어진다.

넷째 줄에는 각 음료의 가격이 공백을 사이에 두고 주어진다.

각 메뉴의 가격은 100의 배수이며, 10000원을 넘지 않는다.

출력
첫째 줄에는 세트 할인이 적용되기 전 가격을 출력한다.

둘째 줄에는 세트 할인이 적용된 후의 최소 가격을 출력한다.

예제 입력 1
3 3 2
2000 3000 2500
800 1300 1000
500 1000
예제 출력 1
12100
11170
힌트
입력 예에 나온 메뉴들의 가격을 모두 합하면 12100원이다.

첫 번째 세트는 3000원짜리 버거, 1300원짜리 사이드메뉴, 1000원짜리 음료로 구성하면 5300 * 0.9 = 4770원이다.

두 번째 세트는 2500원짜리 버거, 1000원짜리 사이드메뉴, 500원짜리 음료로 구성하면 4000 * 0.9 = 3600원이다.

남은 2000원짜리 버거와 800원짜리 사이드메뉴는 음료가 없으므로 세트 할인을 받을 수 없다. 따라서 세트 할인이 적용된 후의 최소 가격은 4770+3600+2800 = 11170원이 된다.
*/
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class problem236 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt(); // 버거의 갯수
        int b = in.nextInt(); // 사이드 메뉴 갯수
        int c = in.nextInt(); // 음료의 갯수

        Integer[] aArr = new Integer[a];
        Integer[] bArr = new Integer[b];
        Integer[] cArr = new Integer[c];

        for (int i = 0; i < a; i++) {
            aArr[i] = in.nextInt();
        }
        for (int i = 0; i < b; i++) {
            bArr[i] = in.nextInt();
        }
        for (int i = 0; i < c; i++) {
            cArr[i] = in.nextInt();
        }
        // 내림차순 정렬
        Arrays.sort(aArr, Collections.reverseOrder());
        Arrays.sort(bArr, Collections.reverseOrder());
        Arrays.sort(cArr, Collections.reverseOrder());

        // 세트 할인이 적용되기 전
        int normalTotal = 0;
        for (int i : aArr) {
            normalTotal += i;
        }
        for (int i : bArr) {
            normalTotal += i;
        }
        for (int i : cArr) {
            normalTotal += i;
        }
        System.out.println(normalTotal);


        int saleTotal = 0;
        // 세트가 되는 경우만 체크
        int size = Math.min(aArr.length, Math.min(bArr.length, cArr.length));

        // 할인적용
        for (int i = 0; i < size; i++) {
            saleTotal += aArr[i] * 0.9;
            saleTotal += bArr[i] * 0.9;
            saleTotal += cArr[i] * 0.9;
        }
        // 나머지는 정상가
        for (int j = size; j < aArr.length; j++) {
            saleTotal += aArr[j];
        }
        for (int j = size; j < bArr.length; j++) {
            saleTotal += bArr[j];
        }
        for (int j = size; j < cArr.length; j++) {
            saleTotal += cArr[j];
        }

        System.out.println(saleTotal);
    }
}
