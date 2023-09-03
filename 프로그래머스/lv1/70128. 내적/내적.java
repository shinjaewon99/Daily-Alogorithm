class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        
        // 1. 문제에서 길이가 같은 1차원 배열이라 했음으로 배열 탐색후 누적 구하기
        for(int i = 0; i < a.length; i++){
            answer += a[i] * b[i];
        }
       
        return answer;
    }
}