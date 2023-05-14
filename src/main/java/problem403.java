/*
2의 영역
문제 설명
정수 배열 arr가 주어집니다. 배열 안의 2가 모두 포함된 가장 작은 연속된 부분 배열을 return 하는 solution 함수를 완성해 주세요.

단, arr에 2가 없는 경우 [-1]을 return 합니다.

제한사항
1 ≤ arr의 길이 ≤ 100,000
1 ≤ arr의 원소 ≤ 10
입출력 예
arr	result
[1, 2, 1, 4, 5, 2, 9]	[2, 1, 4, 5, 2]
[1, 2, 1]	[2]
[1, 1, 1]	[-1]
[1, 2, 1, 2, 1, 10, 2, 1]	[2, 1, 2, 1, 10, 2]
입출력 예 설명
입출력 예 #1

2가 있는 인덱스는 1번, 5번 인덱스뿐이므로 1번부터 5번 인덱스까지의 부분 배열인 [2, 1, 4, 5, 2]를 return 합니다.
입출력 예 #2

2가 한 개뿐이므로 [2]를 return 합니다.
입출력 예 #3

2가 배열에 없으므로 [-1]을 return 합니다.
입출력 예 #4

2가 있는 인덱스는 1번, 3번, 6번 인덱스이므로 1번부터 6번 인덱스까지의 부분 배열인 [2, 1, 2, 1, 10, 2]를 return 합니다.
※ 2023년 04월 27일 입출력 예, 입출력 예 설명 및 예시 테스트 케이스가 수정 되었습니다.
*/

import java.util.ArrayList;
import java.util.List;

public class problem403 {
    class Solution {
        public int[] solution(int[] arr) {
            List<Integer> list = new ArrayList<>();

            int start = 0;
            int end = 0;
            // start 인덱스를 찾습니다.
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 2) {
                    start = i;
                    break;
                }
            }
            // end 인덱스를 찾습니다.
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] == 2) {
                    end = i + 1;
                    break;
                }
            }

            // start와 end의 값이 0일 경우 : 배열에 2가 없다.
            if (start == 0 && end == 0) {
                list.add(-1);
            }

            // start인덱스와 end 인덱스 만큼 값을 list에 담아준다.
            for (int i = start; i < end; i++) {
                list.add(arr[i]);
            }

            int[] answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }

            return answer;
        }
    }

}
