class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // 1. answer 2차원 배열 크기 지정
        int[][] answer = new int[arr1.length][arr2[0].length];
        
        // 2. 입출력의 2번째 예시로 answer[0][0] = 
// (arr1[0][0] * arr2[0][0]) + (arr1[0][1] * arr2[1][0]) + (arr1[0][2] * arr2[2][0]) 이라는 식이 나온다.  
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2[0].length; j++){
                int sum = 0;
                for(int k = 0; k < arr2.length; k++){
                    sum += arr1[i][k] * arr2[k][j];
                }
                answer[i][j] = sum;
            }
            
        }
        
        return answer;
    }
}