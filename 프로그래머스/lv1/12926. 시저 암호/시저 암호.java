class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        
        // 1. 문자열 s의 길이만큼 탐색
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            // 2. 문자가 공백일 경우
            if (sChar == ' ') {
                answer.append(" ");
            }
            // 3. 문자가 A 와 Z 범위 이내 일 경우
            else if (sChar >= 'A' && sChar <= 'Z') {
                // 4. 아스키 코드 값이 넘을경우 % 26 (알파벳이 26개 임으로)
                char temp = (char) ((sChar - 'A' + n) % 26 + 'A');
                answer.append(temp);
            }
            // 5. 문자가 a 와 z 범위 이내 일 경우
            else if (sChar >= 'a' && sChar <= 'z') {
                char temp = (char) ((sChar - 'a' + n) % 26 + 'a');
                answer.append(temp);
            }
        }
        return answer.toString();
    }
}
