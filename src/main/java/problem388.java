/*
순서 바꾸기
문제 설명
정수 리스트 num_list와 정수 n이 주어질 때, num_list를 n 번째 원소 이후의 원소들과 n 번째까지의 원소들로 나눠 n 번째 원소 이후의 원소들을 n 번째까지의 원소들 앞에 붙인 리스트를 return하도록 solution 함수를 완성해주세요.

제한사항
2 ≤ num_list의 길이 ≤ 30
1 ≤ num_list의 원소 ≤ 9
1 ≤ n ≤ num_list의 길이
입출력 예
num_list	n	result
[2, 1, 6]	1	[1, 6, 2]
[5, 2, 1, 7, 5]	3	[7, 5, 5, 2, 1]
입출력 예 설명
입출력 예 #1

[2, 1, 6]에서 첫 번째 이후의 원소는 [1, 6]이고 첫 번째까지의 원소는 [2]입니다. 두 리스트를 이어 붙이면 [1, 6, 2]가 됩니다.
입출력 예 #2

[5, 2, 1, 7, 5]에서 세 번째 이후의 원소는 [7, 5]이고 세 번째까지의 원소는 [5, 2, 1]입니다. 두 리스트를 이어 붙이면 [7, 5, 5, 2, 1]가 됩니다.
*/
public class problem388 {
    class Solution {
        public int[] solution(int[] num_list, int n) {
            int[] result = new int[num_list.length];

            // n 번째 까지의 원소
            for (int i = 0; i < n; i++) {
                result[i + num_list.length - n] = num_list[i];
            }
            // n 번째 이후의 원소
            for (int j = 0; j < num_list.length - n; j++) {
                result[j] = num_list[n + j];
            }
            return result;
        }
    }
}
