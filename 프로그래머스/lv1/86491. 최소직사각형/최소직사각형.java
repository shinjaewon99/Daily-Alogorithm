class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int totalWidth = 0;
        int totalLength = 0;
        
        // 1. 2차원 배열인 sizes를 탐색
        for(int i = 0; i < sizes.length; i++){
            // 2. 가로, 세로 통들어 가장 긴 길이를 구한다.
            int maxWidth = Math.max(sizes[i][0], sizes[i][1]);
            // 3. 가장 긴 길이를 제외한 길이를 구한다.
            int minLength = Math.min(sizes[i][0], sizes[i][1]);
            
            totalWidth = Math.max(totalWidth, maxWidth);
            totalLength = Math.max(totalLength, minLength);
        }
        answer = totalWidth * totalLength;
        return answer;
    }
}