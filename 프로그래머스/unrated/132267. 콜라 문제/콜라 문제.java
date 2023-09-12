class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(true){
            // 1. 빈병 a 개를 가져오면 b 만큼 돌려준다.
            int plus = (n / a) * b; 
            answer += plus;
            
            // 2. 빈병을 계산해서 n에 할당한다.
            int temp = n % a;
            n = temp + plus;
            
            if(a > n) break;
        }        
        return answer;
    }
}