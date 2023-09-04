class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // 1. answer 배열 크기 할당
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        // 2. arr1, arr2 2차원 배열 탐색후 answer 배열에 할당
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2[0].length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        
        return answer;
    }
}