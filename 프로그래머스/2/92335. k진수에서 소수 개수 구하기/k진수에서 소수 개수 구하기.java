class Solution {
    public int solution(int n, int k) {
        int answer = 0;
    
        // n을 k진수로 변환
        String change = Integer.toString(n, k);
        String[] compare = change.split("0");
       
        for(String num : compare) {
            // 0으로 split 하면서 문자열이 빈 문자열이 있을 수 있음
            if(!num.isEmpty() && isPrime(num)){
                answer++;
            }
        }
        
        return answer;
    }
    
    // 소수 판별 메소드
    private boolean isPrime(String compare) {
        Long num = Long.parseLong(compare);
        
        if(num < 2) return false;
        
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}