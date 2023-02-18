/*
문제
2차원 평면 위의 점 N개가 주어진다. 좌표를 y좌표가 증가하는 순으로, y좌표가 같으면 x좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 점의 개수 N (1 ≤ N ≤ 100,000)이 주어진다. 둘째 줄부터 N개의 줄에는 i번점의 위치 xi와 yi가 주어진다. (-100,000 ≤ xi, yi ≤ 100,000) 좌표는 항상 정수이고, 위치가 같은 두 점은 없다.

출력
첫째 줄부터 N개의 줄에 점을 정렬한 결과를 출력한다.

예제 입력 1
5
0 4
1 2
1 -1
2 2
3 3
예제 출력 1
1 -1
1 2
2 2
3 3
0 4
*/

import java.util.Arrays;
import java.util.Scanner;

public class problem98 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        int n = in.nextInt();
        int [][] arr = new int [n][2];

        for(int i = 0; i < n; i++) {
            arr[i][1] = in.nextInt();
            arr[i][0] = in.nextInt();
        }

        // 2차원 배열 오름차순 정렬
        Arrays.sort(arr, (e1, e2) -> {
            if(e1[0] == e2[0]) {
                return e1[1] - e2[1];
            } else {
                return e1[0] - e2[0];
            }
        });

        for(int i = 0; i < n; i++) {
            System.out.println(arr[i][1] + " " + arr[i][0]);
        }
    }
        /* 입력 예시
0 4
1 2
1 -1
2 2
3 3
*/

    /* 로직 입력 실행후
    4 0
    2 1
    -1 1
    2 2
    3 3
    */

}
