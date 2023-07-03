/*
정사각형으로 만들기
문제 설명
이차원 정수 배열 arr이 매개변수로 주어집니다. arr의 행의 수가 더 많다면 열의 수가 행의 수와 같아지도록 각 행의 끝에 0을 추가하고, 열의 수가 더 많다면 행의 수가 열의 수와 같아지도록 각 열의 끝에 0을 추가한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.

제한사항
1 ≤ arr의 길이 ≤ 100
1 ≤ arr의 원소의 길이 ≤ 100
arr의 모든 원소의 길이는 같습니다.
1 ≤ arr의 원소의 원소 ≤ 1,000
입출력 예
arr	result
[[572, 22, 37], [287, 726, 384], [85, 137, 292], [487, 13, 876]]	[[572, 22, 37, 0], [287, 726, 384, 0], [85, 137, 292, 0], [487, 13, 876, 0]]
[[57, 192, 534, 2], [9, 345, 192, 999]]	[[57, 192, 534, 2], [9, 345, 192, 999], [0, 0, 0, 0], [0, 0, 0, 0]]
[[1, 2], [3, 4]]	[[1, 2], [3, 4]]
입출력 예 설명
입출력 예 #1

예제 1번의 arr은 행의 수가 4, 열의 수가 3입니다. 행의 수가 더 많으므로 열의 수를 4로 만들기 위해 arr의 각 행의 끝에 0을 추가한 이차원 배열 [[572, 22, 37, 0], [287, 726, 384, 0], [85, 137, 292, 0], [487, 13, 876, 0]]를 return 합니다.
입출력 예 #2

예제 2번의 arr은 행의 수가 2, 열의 수가 4입니다. 열의 수가 더 많으므로 행의 수를 4로 만들기 위해 arr의 각 열의 끝에 0을 추가한 이차원 배열 [[57, 192, 534, 2], [9, 345, 192, 999], [0, 0, 0, 0], [0, 0, 0, 0]]을 return 합니다.
입출력 예 #3

예제 3번의 arr은 행의 수와 열의 수가 2로 같습니다. 따라서 0을 추가하지 않고 [[1, 2], [3, 4]]을 return 합니다.
*/

import java.util.Arrays;

public class problem427 {
    class Solution {
        public int[][] solution(int[][] arr) {
            int col = arr[0].length;
            int row = arr.length;

            // 행 길이가 긴 경우
            if (row > col) {
                int[][] answer = new int[row][row];
                // Arrays.copyOf(arr[i],row)
                // arr[i][] 의 배열을 쭉 복사합니다, row의 길이만큼
                for (int i = 0; i < row; i++) {
                    answer[i] = Arrays.copyOf(arr[i], row);
                }
                return answer;
            }
            // 열 길이가 긴 경우
            if (col > row) {
                int[][] answer = new int[col][col];

                for (int i = 0; i < col; i++) {
                    // 열의 길이를 행으로 만들기 위해 작성
                    if (i < row) {
                        answer[i] = Arrays.copyOf(arr[i], col);
                    } else {
                        answer[i] = new int[col];
                    }
                }
                return answer;
            }

            return arr;
        }
    }
}
