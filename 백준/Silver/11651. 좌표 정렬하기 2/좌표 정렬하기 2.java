import java.util.Arrays;
import java.util.Scanner;

public class Main {

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