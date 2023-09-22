class Solution {
    public int solution(String s) {
        int sLength = s.length();
        
        // 1. 문자열 s의 첫 글자 저장
        char first = s.charAt(0);
        int answer = 0;
        
        // 2. 다른 글자가 나온 횟수를 저장하기 위한 변수
        int firstNum = 0;
        int compareNum = 0;
        
        // 3. s의 문자열 길이만큼 탐색
        for(int i = 0; i < sLength; i++){
            
            // 4. 비교 변수가 같다는건 분해 해야된다는거
            if(firstNum == compareNum){
                answer++;
                first = s.charAt(i);
            }
            
            // 5. 첫 글자와 같은 경우 firstNum 변수를 증가
            if(first == s.charAt(i)) {
                firstNum++;
            }else{
             compareNum++;   
            }
        }
        
        return answer;
    }
}