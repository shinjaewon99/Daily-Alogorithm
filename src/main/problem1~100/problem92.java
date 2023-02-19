/*
문제
0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 정수 N(0 ≤ N ≤ 12)이 주어진다.

출력
첫째 줄에 N!을 출력한다.

예제 입력 1
10
예제 출력 1
3628800
예제 입력 2
0
예제 출력 2
1
*/



import java.util.Scanner;

public class problem92 {
    public static void main(String[] args) {
        // 간단한 재귀 문제이다. for문 사용
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        int total = 1;

        if(a == 0) {
            System.out.println(total);
        }else {
            for (int i = a; i > 0; i--) {
                total *= i;
            }
            System.out.print(total);
        }

    }
}

/*
public class problem92 {
    public static void main(String[] args) {
        // 간단한 재귀 문제이다. 재귀문 사용
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        System.out.println(Factorial(a));

    }

    private static int Factorial(int a) {

        if(a <= 1){
            return 1;
        }return a * Factorial(a -1);
    }
}
*/



