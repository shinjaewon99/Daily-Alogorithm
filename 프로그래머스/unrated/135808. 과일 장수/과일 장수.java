import java.util.Arrays;


class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int index = 0;
        int scoreLength = score.length;
        int[] reverseScore = new int[scoreLength];
        Arrays.sort(score);
        
        // 1. reverseScore 배열에 내림차순으로 정렬된 score 배열 저장
        for(int i = scoreLength - 1; i >= 0; i--){
            reverseScore[index] = score[i];
            index++;
        }
        
        // 2. m의 갯수가 넘지 않는 선에서 최대이익을 계산
        int minIndex = 0;
        while(true){
            
            if(minIndex + m > scoreLength) break;
            
            // 3. 탐색할 인덱스값 할당
            minIndex += m;
            
            // 4. 최대이익 계산
            answer += reverseScore[minIndex - 1] * m;
        }
        return answer;
    }
}