/*
배열 만들기 2
문제 설명
정수 l과 r이 주어졌을 때, l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.

만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.

제한사항
1 ≤ l ≤ r ≤ 1,000,000
입출력 예
l	r	result
5	555	[5, 50, 55, 500, 505, 550, 555]
10	20	[-1]
입출력 예 설명
입출력 예 #1

5 이상 555 이하의 0과 5로만 이루어진 정수는 작은 수부터 5, 50, 55, 500, 505, 550, 555가 있습니다. 따라서 [5, 50, 55, 500, 505, 550, 555]를 return 합니다.
입출력 예 #2

10 이상 20 이하이면서 0과 5로만 이루어진 정수는 없습니다. 따라서 [-1]을 return 합니다.
*/
public class problem367 {
    public static void main(String[] args) {
        class Solution {
            public boolean isZeroOrFive(int number) {
                // 숫자 0과 5로만 이루어져 있는지 검증
                while (number > 0) {
                    int remainder = number % 10;
                    int temp = remainder % 5;
                    if (temp != 0) { // 0과 5 이외의 숫자가 있다면 false 반환
                        return false;
                    }
                    number /= 10;
                }
                return true;
            }

            public int[] solution(int l, int r) {
                int count = 0; // 숫자 0과 5로만 이루어진 정수의 개수 count
                for (int i = l; i <= r; i++) {
                    if (isZeroOrFive(i)) {
                        count++; // count 증가
                    }
                }
                // 0과 5로만 이루어진 정수가 없다면
                if (count == 0) {
                    return new int[]{-1};
                }
                // 숫자 0과 5로만 이루어진 정수를 담을 배열 생성
                int[] answer = new int[count];
                int index = 0;
                for (int i = l; i <= r; i++) {
                    if (isZeroOrFive(i)) {
                        answer[index] = i;
                        index++;
                    }
                }
                return answer;
            }
        }
    }
}