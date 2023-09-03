class Solution {
    public String solution(String s) {
        String answer = "";
        int sLength = s.length();
        
        // 1. 단어 s 문자열의 길이가 짝수일 경우
        if (sLength % 2 == 0) {
            int div = sLength / 2;
            answer += s.charAt(div - 1);
            answer += s.charAt(div);
        }
        // 2. 단어 s 문자열의 길이가 홀수일 경우
        else {
            int div = sLength / 2;
            answer += s.charAt(div);
        }
        
        return answer;
    }
}
