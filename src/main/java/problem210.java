/*
문제
다솜이는 은진이의 옆집에 새로 이사왔다. 다솜이는 자기 방 번호를 예쁜 플라스틱 숫자로 문에 붙이려고 한다.

다솜이의 옆집에서는 플라스틱 숫자를 한 세트로 판다. 한 세트에는 0번부터 9번까지 숫자가 하나씩 들어있다. 다솜이의 방 번호가 주어졌을 때, 필요한 세트의 개수의 최솟값을 출력하시오. (6은 9를 뒤집어서 이용할 수 있고, 9는 6을 뒤집어서 이용할 수 있다.)

입력
첫째 줄에 다솜이의 방 번호 N이 주어진다. N은 1,000,000보다 작거나 같은 자연수이다.

출력
첫째 줄에 필요한 세트의 개수를 출력한다.

예제 입력 1
9999
예제 출력 1
2
예제 입력 2
122
예제 출력 2
2
예제 입력 3
12635
예제 출력 3
1
예제 입력 4
888888
예제 출력 4
6
*/

import java.util.Scanner;

public class problem210 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String st = in.next();

        // 한세트에 0 ~ 9 배열
        int[] arr = new int[10];
        for (int i = 0; i < st.length(); i++) {
            // 숫자 형태의 char형을 int로 변환 (Character.getNumericValue(char ch));
            int count = Character.getNumericValue(st.charAt(i));
            if (count == 6) {
                arr[9]++;
            } else {
                arr[count]++;
            }
        }

        int max = 0;
        // arr[9] 배열 전까지의 max값을 구해준다.
        for (int i = 0; i < 9; i++) {
            max = Math.max(max, arr[i]);
        }

        // 입력값이 9 일경우
        int nine = arr[9] / 2;
        // arr[9] 배열의 홀수일경우 한세트를 더 사야된다.
        if (arr[9] % 2 == 1) nine++;

        max = Math.max(max, nine);

        System.out.print(max);
    }
}


