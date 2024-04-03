class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        // 1. prices 배열의 값 비교
        for(int i = 0; i< prices.length; i++){
            for(int j = i + 1; j < prices.length; j++){
                answer[i]++;
                
            // 2. 가격이 떨어졌는지 검증
              if(prices[i] > prices[j]){
                  break;
              }
            }
        }
        
        return answer;
    }
}