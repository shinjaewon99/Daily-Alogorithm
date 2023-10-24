
class Solution {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        
        int max = 0;
        int index = 0;
        
        // 1. k갯수만큼 제거하고 number의 길이 - k 만큼 탐색, 
        for(int i = 0; i < number.length() - k; i++){
            max = 0; // 2.max 값 초기화
            
            // 3. 제거하고 남은수 탐색하여 큰 숫자 구하기
            for(int j = index; j <= i + k; j++){
                if(max < number.charAt(j) - '0'){
                    max = number.charAt(j) - '0';
                    index = j + 1;
                }
            }
            
            answer.append(max);
        }
        
        return answer.toString();
    }
}