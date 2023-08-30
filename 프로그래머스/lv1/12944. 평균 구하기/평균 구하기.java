class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        
        // 1. arr 배열 크기 만큼 누적
        for(int i = 0; i < arr.length; i++){
            answer += arr[i];
        }
        
        // 2. 형변환후 초기화
        answer = (double) answer / arr.length;
        
        return answer;
    }
}