import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int length = citations.length;
        Arrays.sort(citations);
      
        for (int i = 0; i < length; i++) {
            // 1. h번 이상 인용된 논문을 찾기위한 변수
            int find = length - i;
            
            // 2. 인용된 횟수가 크거나 같으면 실행
            if (citations[i] >= find) {
                answer = find;
                break;
            }
        }
        
        return answer;
    }
}