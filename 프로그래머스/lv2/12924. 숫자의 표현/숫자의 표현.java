class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 1. 1부터 n까지 탐색
        for(int i = 1; i <= n; i++){
            int total = 0;
            
            // 2. total 변수에 변수 n에 대한 조건 작성
            for(int j = i; j <= n; j++){
                total += j;
                
                if(total == n) {
                    answer++; 
                    break;
                }
                
                // 3. total 변수가 변수 n 보다 크게되면 끝까지 탐색하지 않아도 됨
                if(total > n) {
                    break;
                }
            }
        }
        
        return answer;
    }
}