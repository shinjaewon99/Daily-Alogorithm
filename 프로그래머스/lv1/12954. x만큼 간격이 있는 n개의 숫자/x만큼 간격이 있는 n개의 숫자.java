class Solution {
    public long[] solution(int x, int n) {
        // 1. answer 배열 크기 지정
        long[] answer = new long[n];
        
        // 2. 누적하여 곱해줄 index 변수 선언
        int index = 1;
        
        // 3. answer 배열 초기화
        for(int i = 0; i < n; i++){
            answer[i] = (long) x * index;
            index++;
        }
        return answer;
    }
}