/*
문제
두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.

출력
첫째 줄에는 입력으로 주어진 두 수의 최대공약수를, 둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.

예제 입력 1
24 18
예제 출력 1
6
72
*/

import java.util.Scanner;

public class problem26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int gcd = gcd(a, b);
        int lcm = lcm(a, b);

        System.out.println(gcd + " " + lcm);

    }

    // 최대 공약수
    public static int gcd(int a, int b) {

        if (b == 0) return a;
        /*
        ex) a = 24 b = 18 --> gcd(18, 6) --> gcd(6,0)
        */
        return gcd(b, a % b);
    }
    // 최소 공배수
    public static int lcm(int a, int b) {

        return a * b / gcd(a, b);
    }
  
}



