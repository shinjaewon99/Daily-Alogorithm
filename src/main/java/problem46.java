

/*
문제
N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.

출력
입력으로 주어진 숫자 N개의 합을 출력한다.

예제 입력 1
1
1
예제 출력 1
1
예제 입력 2
5
54321
예제 출력 2
15
예제 입력 3
25
7000000000000000000000000
예제 출력 3
7
예제 입력 4
11
10987654321
예제 출력 4
46
*/
import java.util.Scanner;
public class problem46 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();

        // 한줄에 다 입력받기 위해 String으로 선언
        String inputNumber = in.next();
        int total = 0;

        for (int i = 0; i < size; i++) {
            // charAt은 아스키 코드값을 반환하므로 '0'인 48을 빼준다.
            total += inputNumber.charAt(i) - 48;
        }


        System.out.println(total);

    }
}

