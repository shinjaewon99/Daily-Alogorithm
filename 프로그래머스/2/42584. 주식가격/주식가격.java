class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        // 1. 2중 for문을 통해 가격이 떨어지지 않는 기간 탐색
        for(int i = 0; i < prices.length; i++){
            for(int j = i + 1; j < prices.length; j++){
                answer[i]++;
                if(prices[i] > prices[j]) break;
            }
        }
        
        return answer;
    }
}