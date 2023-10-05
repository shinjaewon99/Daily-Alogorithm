class Solution {
    public int[] solution(int n, long left, long right) {
        // 1. answer 배열 크기 지정
        int[] answer = new int[(int) right - (int) left + 1];
        
        // 2. 배열의 갯수만큼 접근하기 위한 index 변수
        int index = 0;
        
        // 3. (i / n)은 행의값, (i % n)은 열의값중 최대값 구하기
        for(long i = left; i < right + 1; i++){
            answer[index++] = Math.max((int) (i / n), (int) (i % n)) + 1;
        }
        return answer;
    }
}