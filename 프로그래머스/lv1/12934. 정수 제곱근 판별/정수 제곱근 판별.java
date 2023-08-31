class Solution {
    public long solution(long n) {
        // 1. 제곱근으로 변환
        long sqrt = (long) Math.sqrt(n);
        
        // 2. 제곱근이 임의의 양의 정수 n과 같은지 확인
        if(sqrt * sqrt == n){
            return (sqrt + 1) * (sqrt + 1);
        }else{
            return -1;
        }
    }
}