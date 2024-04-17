import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        // 1. 입력값이 3,0,6,1,5 일때 [0,1,3,5,6] 으로 정렬
        citations = Arrays.stream(citations).sorted().toArray();
    
        
        // 2. [0,1,3,5,6] 일 때 
        // 논문 0을 인용한 횟수는 5회
        // 논문 1을 인용한 횟수는 4회
        // 논문 3을 인용한 횟수는 3회 -> 최대값
        for(int i = 0; i < citations.length; i++){
            int start = citations[i];
            int end = citations.length - i;
            
            if(start >= end){
                answer = Math.max(answer, end);
                break;
            }
        }
        
        return answer;
    }
}