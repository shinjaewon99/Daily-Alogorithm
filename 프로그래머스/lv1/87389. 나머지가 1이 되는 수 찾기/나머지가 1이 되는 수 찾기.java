class Solution {
    public int solution(int n) {
        int answer = 0;
        // 1. 매개변수로 주어진 정수까지 탐색
        for (int i = 1; i <= n; i++){
            // 2. 나머지가 1인 경우 for문 탈출
            if(n % i == 1){
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}