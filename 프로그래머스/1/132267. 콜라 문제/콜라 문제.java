class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        // 마트에서 원하는 병 수 보다 크면 반복
        while(n >= a){
            
            int newCoke = (n / a) * b;
            
            answer += newCoke;
            
            n = newCoke + (n % a);
        }
        
        
        return answer;
    }
}