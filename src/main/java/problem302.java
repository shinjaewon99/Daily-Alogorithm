/*
문제
대열이는 욱제의 친구다.

“야 백대열을 약분하면 뭔지 알아?”
“??”
“십대일이야~ 하하!”
n:m이 주어진다. 욱제를 도와주자. (...)

입력
n과 m이 :을 사이에 두고 주어진다. (1 ≤ n, m ≤ 100,000,000)

출력
두 수를 최대한으로 약분하여 출력한다.

예제 입력 1
100:10
예제 출력 1
10:1
예제 입력 2
18:24
예제 출력 2
3:4
*/
import java.util.Scanner;

public class problem302 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] str = in.next().split(":");

        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        int temp = gcd(a, b);
        System.out.println(a / temp + ":" + b / temp);

    }

    // 최대 공약수
    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

}
