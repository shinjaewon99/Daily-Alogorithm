class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 1. 소수는 2부터 시작함
        for(int i = 2; i <= n; i++){
            if(check(i)) answer++;
        }
        return answer;
    }
    
    // 2. 소수 구하기 메소드
    private boolean check (int number){
        if(number == 2) return true;
        if(number == 3) return true;
        
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0) return false;
        }
        return true;
    }
}