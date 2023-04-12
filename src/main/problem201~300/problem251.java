/*
문제
세준이는 양수와 +, -, 그리고 괄호를 가지고 식을 만들었다. 그리고 나서 세준이는 괄호를 모두 지웠다.

그리고 나서 세준이는 괄호를 적절히 쳐서 이 식의 값을 최소로 만들려고 한다.

괄호를 적절히 쳐서 이 식의 값을 최소로 만드는 프로그램을 작성하시오.

입력
첫째 줄에 식이 주어진다. 식은 ‘0’~‘9’, ‘+’, 그리고 ‘-’만으로 이루어져 있고, 가장 처음과 마지막 문자는 숫자이다. 그리고 연속해서 두 개 이상의 연산자가 나타나지 않고, 5자리보다 많이 연속되는 숫자는 없다. 수는 0으로 시작할 수 있다. 입력으로 주어지는 식의 길이는 50보다 작거나 같다.

출력
첫째 줄에 정답을 출력한다.

예제 입력 1
55-50+40
예제 출력 1
-35
예제 입력 2
10+20+30+40
예제 출력 2
100
예제 입력 3
00009-00009
예제 출력 3
0
*/

import java.util.Scanner;

public class problem251 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String ex = in.nextLine();
        String[] arr = ex.split("-");

        int result = 0;
        for (int i = 0; i < arr.length; i++) {

            // "55" - "50 + 40"
            int total = mySum(arr[i]);
            // 맨 앞의 수일경우
            if (i == 0) {
                result += total;
            } else {
                result -= total;
            }
        }
        System.out.print(result);

    }

    // "-" 으로 나뉜 문자열을 +기준으로 누적합
    private static int mySum(String str) {
        int sum = 0;
        // []롤 하여 인식 되게한다.
        String[] temp = str.split("[+]");
        for (int i = 0; i < temp.length; i++) {
            // +로 나뉜 배열의 누적합
            sum += Integer.parseInt(temp[i]);
        }
        return sum;
    }
}
