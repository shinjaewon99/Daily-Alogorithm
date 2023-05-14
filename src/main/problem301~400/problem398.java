/*
빈 배열에 추가, 삭제하기
문제 설명
아무 원소도 들어있지 않은 빈 배열 X가 있습니다. 길이가 같은 정수 배열 arr과 boolean 배열 flag가 매개변수로 주어질 때, flag를 차례대로 순회하며 flag[i]가 true라면 X의 뒤에 arr[i]를 arr[i] × 2 번 추가하고, flag[i]가 false라면 X에서 마지막 arr[i]개의 원소를 제거한 뒤 X를 return 하는 solution 함수를 작성해 주세요.

제한사항
1 ≤ arr의 길이 = flag의 길이 ≤ 100
arr의 모든 원소는 1 이상 9 이하의 정수입니다.
현재 X의 길이보다 더 많은 원소를 빼는 입력은 주어지지 않습니다.
입출력 예
arr	flag	result
[3, 2, 4, 1, 3]	[true, false, true, false, false]	[3, 3, 3, 3, 4, 4, 4, 4]
입출력 예 설명
입출력 예 #1

예제 1번에서 X의 변화를 표로 나타내면 다음과 같습니다

i	flag[i]	arr[i]	X
[]
0	true	3	[3, 3, 3, 3, 3, 3]
1	false	2	[3, 3, 3, 3]
2	true	4	[3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4]
3	false	1	[3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4]
4	false	3	[3, 3, 3, 3, 4, 4, 4, 4]
따라서 [3, 3, 3, 3, 4, 4, 4, 4]를 return 합니다.
*/

import java.util.ArrayList;
import java.util.List;

public class problem398 {
    class Solution {
        public int[] solution(int[] arr, boolean[] flag) {

            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < arr.length; i++) {
                // true 인경우
                if (flag[i]) {
                    int loop = arr[i] * 2;
                    // loop 만큼 List에 값을 담아준다.
                    for (int j = 0; j < loop; j++) {
                        list.add(arr[i]);
                    }
                }
                // false 인경우
                else {
                    int loop = arr[i];
                    for (int j = 0; j < loop; j++) {
                        // 끝부분을 제거해야됨으로 List 길이의 - 1
                        list.remove(list.size() - 1);
                    }
                }
            }

            int[] answer = new int[list.size()];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = list.get(i);
            }


            return answer;
        }
    }
}
