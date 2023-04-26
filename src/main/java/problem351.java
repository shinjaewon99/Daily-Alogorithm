/*
문제
피제수(분자) A와 제수(분모) B가 있다. 두 수를 나누었을 때, 소숫점 아래 N번째 자리수를 구하려고 한다. 예를 들어, A=3, B=4, N=1이라면, A÷B=0.75 이므로 출력 값은 7이 된다.

입력
첫 번째 줄에 A와 B(1 ≤ A, B ≤ 100,000), N(1 ≤ N ≤ 1,000,000)이 공백을 경계로 주어진다.

출력
A÷B를 했을 때, 소숫점 아래 N번째 수를 출력한다.

예제 입력 1
25 7 5
예제 출력 1
2
*/
import java.util.Scanner;

public class problem351 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt(); // 분자
        int b = in.nextInt(); // 분모

        int n = in.nextInt(); // 소수점 아래 N번째

        int temp = a % b;

        // 소수점의 N번째를 구하기위해 나머지구하는 n번 반복한다
        for(int i = 1 ; i < n; i++){
            temp = (temp * 10) % b; // n번째 나머지 갱신
        }

        temp = (temp * 10) / b;
        System.out.println(temp);
    }
}
