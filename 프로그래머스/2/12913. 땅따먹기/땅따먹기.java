class Solution {
    int solution(int[][] land) {
        int answer = 0;

        // 1. dp 방식으로 land 2차원 배열 값 재할당
        for(int i = 1; i < land.length; i++){
            land[i][0] += Math.max(land[i - 1][1], Math.max(land[i - 1][2], land[i - 1][3]));
            land[i][1] += Math.max(land[i - 1][0], Math.max(land[i - 1][2], land[i - 1][3]));
            land[i][2] += Math.max(land[i - 1][0], Math.max(land[i - 1][1], land[i - 1][3]));
            land[i][3] += Math.max(land[i - 1][0], Math.max(land[i - 1][1], land[i - 1][2]));
        }
        
        // 2. 재할당된 land 2차원 배열에서 최대값 찾기
        // 마지막 배열이 최대값 일것이다.
        for(int i = 0; i < 4; i++){
            answer = Math.max(answer, land[land.length - 1][i]);
        }

        return answer;
    }
}
