class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        // 1. p의 갯수와 y의 갯수를 담을 변수 선언
        int pCount = 0;
        int yCount = 0;
        
        // 2. 대소문자 구분없이 알파벳 갯수를 세기 위한 소문자 변환
        String smallS = s.toLowerCase();
        
        // 3. 문자열 길이만큼 탐색하여 알파벳 갯수 증가
        for(int i = 0; i < smallS.length(); i++){
            char sChar = smallS.charAt(i);
            
            if(sChar == 'p'){
                pCount++;
            }else if (sChar == 'y'){
                yCount++;
            }
            
        }
        
        // 4. p의 알파벳 갯수와 y의 알파벳 갯수를 비교하여 반환
        if(pCount == yCount){
            return true;
        }
        return false;
    }
}