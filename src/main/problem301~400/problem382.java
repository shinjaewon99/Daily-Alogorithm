/*
배열의 길이에 따라 다른 연산하기
문제 설명
정수 배열 arr과 정수 n이 매개변수로 주어집니다. arr의 길이가 홀수라면 arr의 모든 짝수 인덱스 위치에 n을 더한 배열을, arr의 길이가 짝수라면 arr의 모든 홀수 인덱스 위치에 n을 더한 배열을 return 하는 solution 함수를 작성해 주세요.

제한사항
1 ≤ arr의 길이 ≤ 1,000
1 ≤ arr의 원소 ≤ 1,000
1 ≤ n ≤ 1,000
입출력 예
arr	n	result
[49, 12, 100, 276, 33]	27	[76, 12, 127, 276, 60]
[444, 555, 666, 777]	100	[444, 655, 666, 877]
입출력 예 설명
입출력 예 #1

예제 1번의 arr의 길이는 5로 홀수입니다. 따라서 arr의 짝수 인덱스 0, 2, 4에 주어진 n 값인 27을 더하면 [76, 12, 127, 276, 60]이 됩니다. 따라서 [76, 12, 127, 276, 60]를 return 합니다.
입출력 예 #1

예제 2번의 arr의 길이는 4로 짝수입니다. 따라서 arr의 홀수 인덱스 1, 3에 주어진 n 값인 100을 더하면 [444, 655, 666, 877]이 됩니다. 따라서 [444, 655, 666, 877]를 return 합니다.
*/
public class problem382 {
    class Solution {
        public int[] solution(int[] arr, int n) {
            int[] answer = new int[arr.length];

            // n이 짝수일경우
            // for문의 증감문을 신경써주면서 작성해줘야한다.
            if(arr.length % 2 == 0){
                for(int i = 1; i < arr.length; i+=2){
                    answer[i] = arr[i] + n;
                }
                for(int i = 0; i < arr.length; i+=2){
                    answer[i] = arr[i];
                }
            }
            // n이 홀수일경우
            else{
                for(int i = 1; i < arr.length; i+=2){
                    answer[i] = arr[i];
                }
                for(int i = 0; i < arr.length; i+=2){
                    answer[i] = arr[i] + n;
                }
            }
            return answer;
        }
    }
}
