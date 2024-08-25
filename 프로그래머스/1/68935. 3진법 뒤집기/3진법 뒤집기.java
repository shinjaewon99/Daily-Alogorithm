class Solution {
    public int solution(int n) {
        
        String result = "";
        while(n > 0){
            result += n % 3;
            n /= 3;
        }
        
        // 3진법인 result를 10진법으로 변환
        return Integer.parseInt(result, 3);
    }
}