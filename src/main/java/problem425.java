/*
두 수의 합
문제 설명
0 이상의 두 정수가 문자열 a, b로 주어질 때, a + b의 값을 문자열로 return 하는 solution 함수를 작성해 주세요.

제한사항
1 ≤ a의 길이 ≤ 100,000
1 ≤ b의 길이 ≤ 100,000
a와 b는 숫자로만 이루어져 있습니다.
a와 b는 정수 0이 아니라면 0으로 시작하지 않습니다.
입출력 예
a	b	result
"582"	"734"	"1316"
"18446744073709551615"	"287346502836570928366"	"305793246910280479981"
"0"	"0"	"0"
입출력 예 설명
입출력 예 #1

예제 1번의 a, b는 각각 582, 734이고 582 + 734 = 1316입니다. 따라서 "1316"을 return 합니다.
입출력 예 #2

예제 2번의 a, b는 각각 18446744073709551615, 287346502836570928366이고 18446744073709551615 + 287346502836570928366 = 305793246910280479981입니다. 따라서 "305793246910280479981"을 return 합니다.
입출력 예 #3

예제 3번의 a, b는 각각 0, 0이고 0 + 0 = 0입니다. 따라서 "0"을 return 합니다.
*/
import java.math.BigInteger;
public class problem425 {

    class Solution {
        public String solution(String a, String b) {
            // 2번째 예시가 int 타입, long 타입의 범위를 다 벗어난다.
            // 두 문자열을 BigInteger로 변환
            BigInteger numA = new BigInteger(a);
            BigInteger numB = new BigInteger(b);

            BigInteger sum = numA.add(numB);

            // 결과를 문자열로 변환하여 반환
            return sum.toString();
        }
    }
}
