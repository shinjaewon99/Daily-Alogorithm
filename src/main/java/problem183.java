/*
문제
L과 R이 주어진다. 이때, L보다 크거나 같고, R보다 작거나 같은 자연수 중에 8이 가장 적게 들어있는 수에 들어있는 8의 개수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 L과 R이 주어진다. L은 2,000,000,000보다 작거나 같은 자연수이고, R은 L보다 크거나 같고, 2,000,000,000보다 작거나 같은 자연수이다.

출력
첫째 줄에 L보다 크거나 같고, R보다 작거나 같은 자연수 중에 8이 가장 적게 들어있는 수에 들어있는 8의 개수를 구하는 프로그램을 작성하시오.

예제 입력 1
1 10
예제 출력 1
0
예제 입력 2
88 88
예제 출력 2
2
예제 입력 3
800 899
예제 출력 3
1
예제 입력 4
8808 8880
예제 출력 4
2
*/
import java.util.Scanner;

public class problem183 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String st = in.nextLine();
        String[] arr = st.split(" ");

        char[] left = arr[0].toCharArray();
        char[] right = arr[1].toCharArray();


        int count = 0;
        // 자릿수가 다르면 0
        if (left.length == right.length) {
            for (int i = 0; i < left.length; i++) {
                // 자릿수 기준으로 같은지 확인, 8인지 확인
                if (left[i] == right[i] && left[i] == '8') {
                    count++;
                } else {
                    if (left[i] != right[i]) break;
                }
            }
        }

        System.out.print(count);
    }
}

