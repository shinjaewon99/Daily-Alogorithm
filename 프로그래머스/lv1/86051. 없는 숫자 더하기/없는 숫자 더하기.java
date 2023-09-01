class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        
        // 1. 1 ~ 9 까지 numbers 배열에 없는수 빼기
        for(int i = 0; i < numbers.length; i++){
            answer -= numbers[i];
        }
        return answer;
    }
}