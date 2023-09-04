class Solution {
    public boolean solution(String s) {     
        boolean answer = true;
        
        // 1. 문자열 s의 길이가 4 혹은 6인 경우
        if(s.length() == 4 || s.length() == 6){
            // 2. s 문자열 길이만큼 숫자인지 검증
            for(int i = 0; i < s.length(); i++){
                // 3. 아스키 값 구하기
                int compare = s.charAt(i) - '0';
                if(compare < 0 || compare > 10){
                    return false;
                }
            }
        }
        // 4. 문자열 s의 길이가 4 혹은 6이 아닌경우
        else{
            return false;
        }
        return answer;
    }
}

