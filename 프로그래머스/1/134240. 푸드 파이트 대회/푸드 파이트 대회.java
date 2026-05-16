class Solution {
    public String solution(int[] food) {
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();

        
        for(int i = 1; i < food.length; i++){
            for(int j = 0; j < food[i] / 2; j++){
                left.append(i);
                right.append(i);
            }
        }
        
        // 중간에 물 더해주기
        left.append(0);
        
        String answer = left.toString() + right.reverse().toString();
        
        return answer;
    }
}