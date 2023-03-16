/*다음 큰 숫자
문제 설명
자연수 n이 주어졌을 때, n의 다음 큰 숫자는 다음과 같이 정의 합니다.

조건 1. n의 다음 큰 숫자는 n보다 큰 자연수 입니다.
조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같습니다.
조건 3. n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수 입니다.
예를 들어서 78(1001110)의 다음 큰 숫자는 83(1010011)입니다.

자연수 n이 매개변수로 주어질 때, n의 다음 큰 숫자를 return 하는 solution 함수를 완성해주세요.

제한 사항
n은 1,000,000 이하의 자연수 입니다.
입출력 예
n	result
78	83
15	23
입출력 예 설명
입출력 예#1
문제 예시와 같습니다.
입출력 예#2
15(1111)의 다음 큰 숫자는 23(10111)입니다.
*/
class Solution {
    public int solution(int n) {
        int answer = 0;
        // Integer.toBinaryString(n) = 2진수로 변환하는 메서드
        // Integer.bitCount = 2진수로 변환후 포함된 1을 카운트 해준다
        int count = Integer.bitCount(n);


        while(true){
            // n의 값을 증가시켜준다.
            n++;
            int result = Integer.bitCount(n);

            // 2진수의 1의 갯수가 동일할시 break;
            if(count == result){
                answer = n;
                break;
            }
        }
        return answer;
    }
}
