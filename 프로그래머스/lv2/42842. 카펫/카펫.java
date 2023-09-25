class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        
        // (6,2) 가 아닌 (4,3) 이 정답이다.
        for(int i = 3; i < total; i++){
            // 1. 격자의 약수 구하기
            int div = total / i;
            
            // 2. 세로의 길이가 3 이상이어야 중앙에 노란색 격자가 위치할수 있다.
            if(div >= 3){
                int width = Math.max(div, i);
                int height = Math.min(div, i);
                
                // 3. 중앙에 위치하기 위해선 맨위 맨아래 칸은 제거
                int center = (width - 2) * (height - 2);
                
                if(yellow == center){
                    answer[0] = width;
                    answer[1] = height;
                }
            }
        }
        
        return answer;
    }
}