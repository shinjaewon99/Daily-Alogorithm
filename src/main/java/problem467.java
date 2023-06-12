/*
문제
2진수가 주어졌을 때, 8진수로 변환하는 프로그램을 작성하시오.

입력
첫째 줄에 2진수가 주어진다. 주어지는 수의 길이는 1,000,000을 넘지 않는다.

출력
첫째 줄에 주어진 수를 8진수로 변환하여 출력한다.

예제 입력 1
11001100
예제 출력 1
314
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class problem467 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader
                (new InputStreamReader(System.in));
        // 2진수 -> 10진수
        BigInteger integer = new BigInteger(br.readLine(), 2);

        // 10진수 -> 8진수
        System.out.println(integer.toString(8));

    }
}