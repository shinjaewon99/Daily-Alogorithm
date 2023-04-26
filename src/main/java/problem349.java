/*
문제
키파는 문득 3과 4의 견고한 벽에 가로막혀 스포트라이트를 받지 못하는 5를 떠올렸다. '세상에 얼마나 많은 것들이 5와 관련이 있는데!'

키파는 5가 쓰이는 곳을 떠올리기 시작했다. 사람의 손가락도 5개, 정다면체의 개수도 5개, 알려진 불가촉 홀수는 5뿐이고, 별은 보통 오각별, 그리고 무엇보다 "별이 다섯 개!"

그러자 문득 키파는 자신의 마음 속에서 다섯제곱을 하고 싶은 욕망이 올라오는 것을 느꼈다. 키파를 위해, 다섯 자리 수를 입력받아, 각 자릿수의 다섯제곱의 합을 출력하는 프로그램을 작성해 주자.

입력
첫째 줄에 다섯 자리인 양의 정수
$n$이 주어진다. 주어지는
$n$은
$10^{4} \leq n < 10^{\mathbf{5}}$을 만족한다.

출력
첫째 줄에 각 자릿수의 다섯제곱의 합을 출력하라.

예제 입력 1
12345
예제 출력 1
4425
예제 입력 2
54748
예제 출력 2
54748
예제 입력 3
92727
예제 출력 3
92727
예제 입력 4
93084
예제 출력 4
93084
*/
import java.util.Scanner;

public class problem349 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String inputString = in.next();
        int[] temp = new int[inputString.length()];
        int result = 0;
        for (int i = 0; i < inputString.length(); i++) {
            temp[i] = inputString.charAt(i) - '0';
        }

        for (int i = 0; i < temp.length; i++) {
            result += Math.pow(temp[i], 5); // 값을 5의 제곱해주면서 result에 누적해준다.
        }

        System.out.println(result);

    }
}
