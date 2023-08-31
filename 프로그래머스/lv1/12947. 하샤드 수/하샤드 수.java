class Solution {
    public boolean solution(int x) {
        // 1. 자릿수의 합을 담을 변수
        int sum = 0;
        
        // 2. 자연수 x를 담을 변수
        int temp = x;
        
        // 3. 자릿수의 합 구하기
        while(temp > 0){
            int div = temp % 10;
            sum += div;
            temp /= 10;
        }
        
        // 4. 하샤드 수 인지 판별
        if(x % sum == 0){
            return true;
        }
        
        return false;
    }
}