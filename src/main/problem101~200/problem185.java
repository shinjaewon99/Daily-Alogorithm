/*
자연수 뒤집어 배열로 만들기
문제 설명
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

제한 조건
n은 10,000,000,000이하인 자연수입니다.
입출력 예
n	return
12345	[5,4,3,2,1]
*/
import java.util.*;
class Solution {
    public int[] solution(long n) {
        // long 타입 String으로 변환
        String st = String.valueOf(n);
        int[] answer = new int[st.length()];



        for(int i = 0; i < st.length(); i++){
            answer[i] = (int)st.charAt(i) - '0';
        }
        int [] result = new int[answer.length];
        int index = 0;
        // 내림차순 정렬
        for(int j = answer.length - 1; j >= 0; j--){
            result[index] = answer[j];
            index++;
        }
        return result;
    }
}

