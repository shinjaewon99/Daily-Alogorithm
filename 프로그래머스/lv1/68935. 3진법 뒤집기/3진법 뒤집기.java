class Solution {
    public int solution(int n) {
        int answer = 0;
        String temp = "";
        
        // 1. 자연수 n이 0 보다 클때까지 반복한다.
        while(n > 0){
            temp += n % 3;
            n /= 3;
        }
        
        // 2.  Integer.parseInt(String, y) : y진법인 수를 10진법으로 바꾼다.
        return Integer.parseInt(temp, 3);
    }
}