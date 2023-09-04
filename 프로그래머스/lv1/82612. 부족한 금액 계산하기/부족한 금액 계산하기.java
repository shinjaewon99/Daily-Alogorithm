class Solution {
    public long solution(int price, int money, int count) {
        long total = 0;
        // 1. count 만큼 인상된 이용료 계산
        for(int i = 1; i <= count; i++){
            total -= price * i;
        }
    
        // 2. 이용료를 지불할 금액이 부족할 경우 절대값 부족한 금액 구하기
        total = Math.abs(total);
        if(total > money){
            total -= money;
        }else{
            return 0;
        }
        return total;
    }
}