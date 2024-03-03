class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
    
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            // 1. index의 크기만큼 아스키 코드를 증가하고 경계값 'z'를 확인
            for(int j = 0; j < index; j++){
                ch += 1;
                if(ch > 'z'){
                    ch -= 26;
                }
                
                // 2. skip 문자열에 포함될 경우, 아스키 코드값을 증가
                if(skip.contains(String.valueOf(ch))){
                    j--;
                }
            }
            answer.append(ch);
        }
        
        return answer.toString();
    }
}